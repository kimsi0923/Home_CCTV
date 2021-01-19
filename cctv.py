#!/usr/bin/env python3
import cv2
import time, os
from flask import Flask, render_template, Response
import numpy as np
import testmsg
import pigpio
import io
import threading

app = Flask(__name__)

@app.route('/')
def index():
    return render_template('index.html')

def gen():
    global flag
    global cap
    if on_off == 1:
        if flag == 0:
            cap.release()
            cv2.destroyAllWindows()
        time.sleep(2)
        cap = cv2.VideoCapture(-1)
        cap.set(3,320)
        cap.set(4,240)
        flag = 0
    elif on_off == 0:
        cap.release()
        cv2.destroyAllWindows()
    trig = 0
        
    while (on_off):
        ret, img = cap.read()
        gray = cv2.cvtColor(img, cv2.COLOR_BGR2GRAY)
        faces = faceCascade.detectMultiScale(
                gray,
                scaleFactor=1.2,
                minNeighbors=5,
                minSize=(20, 20)
                )

        for (x, y, w, h) in faces:
            if x > 0 and trig == 0:
                print("Send a messege.")
                testmsg.sendText()
                trig = 1

            cv2.rectangle(img,(x, y), (x+w, y+h), (0, 255, 0), 2)
            roi_gray = gray[y: y+h, x: x+w]
            roi_color = img[y: y+h, x: x+w]
           
        ret, jpeg = cv2.imencode('.jpg', img)

        frame = jpeg.tobytes()
        yield (b'--frame\r\n'
               b'Content-Type: image/jpeg\r\n\r\n' + frame + b'\r\n')

@app.route('/on')
def detect_on():
    global on_off
    on_off = 1
    return 'Detect On'

@app.route('/off')
def detect_off():
    global on_off
    on_off = 0
    return 'Detect Off'

@app.route('/left')
def turn_left():
    global cycle
    global pi
    if cycle <= 2500:
        cycle += 100
    pi.set_servo_pulsewidth(18, cycle)
    pi.get_servo_pulsewidth(18)
    return 'Turn Left'

@app.route('/right')
def turn_right():
    global cycle
    global pi
    if cycle >= 500:
        cycle -= 100
    pi.set_servo_pulsewidth(18, cycle)
    pi.get_servo_pulsewidth(18)
    return 'Turn Right'

@app.route('/video_feed')
def video_feed():
    return Response(gen(),
                    mimetype='multipart/x-mixed-replace; boundary=frame')

if __name__ == '__main__':
    os.system("sudo pigpiod")
    global on_off
    global flag
    global cap
    global cycle
    global pi
    on_off = 1
    flag = 1
    cycle = 1500
    pi = pigpio.pi()
    pi.set_mode(18, pigpio.OUTPUT)
    pi.get_mode(18)
    pi.set_servo_pulsewidth(18, cycle)
    pi.get_servo_pulsewidth(18)

    faceCascade = cv2.CascadeClassifier('/home/pi/opencv/opencv-master/data/haarcascades/haarcascade_frontalface_default.xml')
    app.run(host='0.0.0.0', debug=True, threaded=True)
