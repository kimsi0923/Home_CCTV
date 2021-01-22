# 방범용 Home_CCTV

## 차 례

1. 개발 배경 및 필요성	

2. 최종 목표	

3. 관련 개발 및 연구동향	

4. 개발 내용	

5. 성능 평가	

6. 활용 방안 및 효과	

7. 개발 추진체계 및 개발 일정	

8. 결론	

9. 참고 자료	

## 1. 개발 배경 및 필요성
과거에 비해 1인 가족의 비율이 늘어나고 있고, 혼자 자취하는 사람들이나 여자, 노인 등등 여러 가지 다양한 범죄에 노출되어 있다.
이를 방지하기 위해서 요즘 흔히 볼 수 있는 가정용 CCTV를 생각하게 되었고, 기존에 있는 많은 업체들은 설치 공간에 제약을 받고 설치비, 큰 유지 비용 등의 단점을 생각하여 직접  만들어 보자고 생각하게 되었다.

실제로 센서를 통해 침입자 감지와 CCTV 녹화를 통한 비디오 보안서비스, 사이렌 알림, 112 간편신고 등 여러 가지 기능을 가지고 있는 IoT들이 사용되고 있다.
서울시방경찰청은 올해 여성안전 스마트치안 환경 구축을 위한 ‘우리집지킴이’ 지원사업 업무협약을 체결함으로써 여성 1인 가구 500가정에 위와 같은 기능을 가진 IoT를 보급하여 관리를 해준다고 한다.
 
경찰청의 통계자료에 따르면 CCTV를 통한 범인 검거율이 해마다 증가하고 있다고 한다.
이를 활용하여 CCTV를 통해 사전에 범죄활동을 방지하고, 범죄가 일어났다해도 높은 검거율을 보여주어 범죄자들에게 경각심을 주어야 한다고 생각한다.
그래서 공공장소 뿐만이 아닌 가장 우리 생활에 많이 사용되고있는 가정부터 나를 보호해야겠다고 생각되어 이 작품을 만들게 되었다.
 
## 2. 최종 목표
혼자 사는 사람이 많아지고 그들을 노리는 강력범죄들이 해마다 증가하고 있다.
이 작품을 통해서 집 안에서도 일어날 수 있는 사소한 도난, 무단침입 등 범죄들을 예방하고, 더 큰 사고로 이어질 수 있는 것을 방지, 개인적인 공간의 보안을 목표로 한다.
CCTV가 켜지는 순간부터 얼굴검출을 통해 비어있는 집 또는 공간에 침입 여부를 확인한다. 얼굴검출이 되는 순간 침입자로 간주하고 나에게 전송되는 문자를 통해서 범행 시간대를 유추할 수 있다.
그리고 동일한 와이파이 공유기를 통해 스마트폰으로 카메라 켜고 끄는 기능, 카메라 방향을 좌우로 조절하는 기능, 스트리밍을 통해 실시간으로 영상을 볼 수 있는 기능을 넣어 좀 더 편리하게 사용하도록 한다.
 
## 3. 관련 개발 및 연구동향
4차 산업혁명 기술은 영상 시스템을 인공지능이 탑재된 지능형으로 바꿔 놓게 된다. 지능형 CCTV는 사람을 알아보고 현상 수배범이나 범죄인일 경우 자동으로 경찰서에 통보해주게 된다. 범죄와 사건, 사고를 예측하고 차단하는 역할을 하게 되는 것이다. 인공지능이 영상을 보고 필요한 내용을 추출하는 ‘인간 영상 분석사’ 역할을 하게된다. 이른바 비디오 튜링 테스트(VTT, Video Turing Test)프로젝트가 국책 과제로 진행되고 있다.

지능형 CCTV는 누군가 경계선을 넘을 때, 폭력 사태가 발생할 때, 차 사고가 났을 때, 도둑이 침범했을 때, 사람이 갑작스럽게 쓰러졌을 때 등 위기 상황을 정확하게 인지해 상황실에 경보를 보낼 수 있게 된다. 수많은 영상 데이터를 토대로 인공지능이 딥러닝을 통해 CCTV에 찍히는 영상의 상황을 이해하게 되고, CCTV에 탑재된 인공지능은 보고, 듣고, 말하는 역량을 갖추고 있어 위험 상황을 경고할 수도 있다. 음원과 영상을 분석해낼 수 있는 지능형 CCTV의 기술은 스마트시티에 접목되어 장차 범죄와 사고가 없는 안전한 세상을 만드는데 기여할 수 있게된다.

#### 지능형 CCTV 통합관제시스템 현황

기술개발 동향 = LBS(Location Based System) 기술과 공간정보 기술이 발전하면서 이를 기반으로한 CCTV 통합관제시스템 기술이 방범용 CCTV 기능은 물론 ITS(Intelligent Traffic System)와 연계돼 전국적으로 확산되고 있다.
이처럼 CCTV 관제시스템은 통합 서비스를 지향하면서 빠르게 지능화돼 가고 있다.

특히 2013년부터 4G-LTE A 이동통신 기술이 보급되고 차세대(5G) 이동통신 시스템을 위한 준비가 개시되면서 CCTV 통합관제 시스템도 빠르게 변화하고 있다. 이를 하드웨어 사양과 관리 및 운용의 효율성 측면에서 간단히 요약하면 다음과 같다.

#### 하드웨어 사양 측면
- 하드웨어 사양의 고급화에 따른 카메라모듈, 영상전송모듈, 영상저장장치 및 모니터 모듈 등 CCTV 통합관제 시스템 관련 부품도 사양이 고급화돼 가고 있다.

- 특히 메가 픽셀(Mega PIXEL) 급의 해상도에 대한 수요와 아울러 500TB 급의 초대용량의 스토리지 등에 대한 요구가 급격히 증가하면서 고집적 서버장비의 수요가 빠르게 확대돼 가고 있다.

- CCTV 통합관제 시스템에 연결 가능한 다양한 클라이언트 기기의 보급(태블릿 PC, 스마트 폰 등 스마트미디어 기기)이 확대되고 CCTV 시스템이 빠르게 지능화되면서 지능형 CCTV 통합관제 기술의 상용화 추세가 빠르게 진행되고 있다.

- 이에 따라 기존 아날로그 관제시스템을 IP 네트워크 기반의 영상감지 시스템으로 교체하려는 수요가 급격히 확대돼 가고 있다.

#### 관리 및 운용 효율성 측면

- 관리 및 운용의 효율성 측면에서 보면 CCTV 통합관제 시스템은 서버 가상화(수많은 서버의 운영·관리 비용이 기하급수적으로 증가하면서 IT 환경의 단순화를 통해 총 소유 비용을 줄일 수 있는 방법 중 하나임. 서버 가상화는 단순한 메모리 가상화를 넘어 서버를 구성하는 모든 자원의 가상화를 의미하는 것이다.) 기술력 기반의 추가적인 증설이 확대돼가고 있다.

- 이에 따라 통합관제센터를 중심으로 분산되는 저장 및 분배 기능을 갖는 가상화 서버의 통합 및 추가증설에 대한 효율적인 대응체계의 필요성이 대두되고 있다.

## 개발 내용
![졸업작품_구성도](https://user-images.githubusercontent.com/73647861/105055188-28ccf300-5ab6-11eb-8afa-aa25c6710944.jpeg)
#### 설명

라즈베리파이와 연결되어있는 카메라를 통해서 얼굴 검출을 한다.   
학습되어있는 데이터를 통해서 사람 얼굴이라고 인식되었을 때 메시지 서비스를 통해서 지정해둔 사용자의 휴대폰으로 문자를 전송한다.   
또한 같은 공유기를 사용하고 있을 때, 안드로이드 앱을 이용해 영상 스트리밍, 서보모터를 이용한 카메라 각도 조절, CCTV(라즈베리파이 영상)를 켜고 끌 수 있다.   
전원 연결을 하면 자동으로 CCTV가 실행 된다.

#### 시스템 상세 기능
* 얼굴 검출 기능   
Haar Cascades 알고리즘을 통해 얼굴을 검출   
Haar Cascades는 하르 특징을 계산한 후에 의미있는 특징을 골라내기 위해 Adaboost를 사용한다. 이렇게 처리된 하르 특징을 적용해 얼굴을 검출하는데, 그냥 하면 계산량이 많기 때문에 비효율적이다.   
그래서 현재 윈도우가 있는 영역이 얼굴인지 단계별로 체크하는 방식인 Cascade Classifier를 수행한다.

* 웹 서버를 통한 문자 전송 기능   
Rest API를 이용해 문자를 보내는 기능이다.
Http메소드를 사용하여 형식에 맞게 서버에 요청하면 서버에서는 그에 맞는 요청을 처리하게 된다. 이 처리를 통해 문자를 전송하게 된다.

* 서보모터 조작 기능   
파이썬의 Flask서버와 PWM제어를 통해 카메라 각도 조절   
Flask를 통해 서버 구동, 각 URL에 DutyCycle을 달리하여 서보모터를 좌, 우로 조절한다.

* 실시간 CCTV 스트리밍 기능   
파이썬의 Flask서버 구동을 통하여 실시간 영상 확인 가능   
스마트폰의 크롬, PC로는 라즈베리파이의 IP주소로 접속하여 확인가능하고 앱에서도 Webview를 통해 cctv컨트롤과 함께 실시간 영상 확인이 가능하다.

* CCTV ON/OFF 기능   
파이썬의 Flask 서버 구동을 통해 컨트롤 한다. 역시 각 URL에 기능을 구현하여 카메라를 켜고 끄는 것을 수행한다.

#### 하드웨어 구성
* 라즈베리파이 3B+   
전체적인 시스템 제어

* 라즈베리파이 카메라 모듈 V2   
렌즈를 통해 영상을 입력받음

* 9g 미니 서보모터 SG-90   
라즈베리파이 카메라를 부착하여 각도를 조절할 수 있게 하여 다방면으로 촬영할 수 있게끔 도와주는 용도로 사용됨

#### 소프트웨어 구성
* 영상 처리   
파이 카메라를 통해 입력받는 영상을 Flask서버로 스트리밍, Haar Cascades 알고리즘을 통해 얼굴 검출

* Flask 서버   
서버 구동을 통해 각 URL에 원하는 제어들을 입력

* 안드로이드 앱   
웹뷰를 통한 실시간 영상 확인 가능, 버튼들을 이용해 라즈베리파이 IP연결 설정, 카메라 각도 조절, 카메라 on/off 기능 

* GPIO 제어(pigpio)   
서보모터를 제어하기 위한 GPIO설정, 일반 RPi.GPIO를 이용하려 했으나 Flask때문인지 불안정하여 pigpio library를 사용

* Rest API   
웹 서버에 형식에 맞는 내용을 Http메소드를 사용해 요청한다. 웹 서버는 요청을 처리하여 사용자에게 문자를 전송

## 5. 성능 평가
#### 얼굴검출 기능
![얼굴_인식](https://user-images.githubusercontent.com/73647861/105060710-0d64e680-5abc-11eb-9f2d-598c8dd81417.jpg)
```
사람 얼굴의 눈, 코, 입, 얼굴 형태, 윤곽 등 여러 가지 특징들을 처리한 학습 데이터를 바탕으로 얼굴 검출 알고리즘을 수행한다. 
방안이 어둡거나 복면, 마스크 등 얼굴을 가렸을 때, 카메라를 얼굴 높이에 맞춰놓지 않았을 때 인식을 100% 하지 못한다. 
그리고 얼굴과 비슷한 형태도 얼굴로 인식하기 때문에 개선이 필요하다. 
작품 평가 시간엔 천장에 설치가 불가능하여 얼굴 검출 기능을 넣었지만, 일반적인 CCTV위치에 놓는다면 사람 몸 검출 기능으로 바꿔서 실제 사용이 가능할 것으로 보인다.
```
#### 안드로이드 앱
<img src="https://user-images.githubusercontent.com/73647861/105061162-8c5a1f00-5abc-11eb-8eb7-4c17e48be403.jpg" width="300" height="600"> <img src="https://user-images.githubusercontent.com/73647861/105061209-9e3bc200-5abc-11eb-947e-42216b80ae99.jpg" width="300" height="600">

- 실시간 스트리밍
```
공유기의 상태나 해상도 설정에 따라 영상 송출의 부드러움이 좌지우지 된다.
그리고 얼굴 검출이 이루어질 때도 버벅거림을 볼 수 있었다.
적절한 해상도를 설정해 최적의 조건을 맞추어주는 것이 최선인 것 같다.
```
- 서브 모터 컨트롤
```
앱 내의 버튼을 클릭해 서브모터의 회전반경을 최대 180도 까지 좌, 우로 조절한다. 
버튼에 대한 반응도 공유기 상태에 따라 속도가 달랐으며 사용에는 지장이 없는 속도였다.
```
- CCTV 전원 ON/OFF
```
마찬가지로 공유기의 상태에 따라 반응 속도가 달라지며 사용에는 지장이 없었다.
그리고 카메라가 켜져있는 상태에서 CCTV ON버튼을 누르게 되면 라즈베리파이 내부에서는 카메라가 이미 열려있기 때문에 에러 메시지가 뜨지만 사용에는 지장이 없었다.
```

#### 문자 전송
![문자전송1](https://user-images.githubusercontent.com/73647861/105062249-beb84c00-5abd-11eb-90b9-e64fe519ec66.jpg) <img src="https://user-images.githubusercontent.com/73647861/105143376-1cd94380-5b3f-11eb-9ff6-e3e8d980be4d.jpg" width="200" height="400">
```
얼굴 검출이 이루어지면 문자가 전송되기 때문에 CCTV가 켜지고 난 후 첫 얼굴 검출 이 후에는 전송되지 않는다. 그렇기 때문에 첫 얼굴 검출이 유사한 얼굴 형태에 의한 오류 작동이라면 그 이후에 이루어지는 얼굴 검출에는 문자 전송이 되지 않는다.
이에 대한 경우의 수도 생각해서 개선할 필요가 있다.
```
## 6. 활용 방안 및 효과
요즘 혼자 사는 1인 세대가 증가한 만큼 범죄에 노출이 많이 되어있다. 
그리고 이런 범죄가 뉴스에 자주 나오면서 불안함을 느끼는 사람이 점점 늘어나고 있다. 
이를 방지하기 위해 집안에 카메라를 설치해두어 도난, 무단침입을 방지한다. 

그리고 잠을 자는 동안에도 범죄가 일어날 수 있기 때문에 현관에 CCTV를 설치해 사용자가 받는 피해를 줄이고 좀 더 빠른 대처를 할 수 있도록 한다. 
혹은 문자 메세지를 받는 사람을 바로 경찰 번호로 설정해 신속한 경찰의 도움을 받을 수도 있을 것이다.

## 7. 개발 추진체계 및 개발 일정
#### 시스템 설계
자료 조사 : 9/30 ~ 10/5

각 모듈별 상세 설계 : 9/30 ~ 10/12
#### 시스템 기능별 개발
영상 처리 및 앱 : 10/6 ~ 11/9

메세지 송신 : 10/14 ~ 10/27

카메라 회전 (서보모터) : 11/10 ~ 11/13
#### 통합 테스트 및 수정 보완
시스템 통합 테스트 : 11/13 ~ 11/20

수정 보완 : 11/13 ~ 11/20

최종 : 11/21
## 8. 결론
4차 산업혁명에 들어선 만큼 ICBM기술 그 외에 AI까지 나날이 발전하고 있다.
특히 사물 인터넷은 이제 생활 속에 완전히 녹아들어 우리 인간들 삶의 질을 완전히 높혀 주었다.
IoT 제품들을 이용하면서 ‘이 것은 어떤 알고리즘과 원리로 작동할까?’ 라는 생각을 종종 가지곤 했지만 제대로 된 프로젝트를 진행해보니 많은 어려움을 겪으며 개발자들의 대단함, 존경심 그리고 고마움을 다시 한 번 느꼈다.
사실 시작하기 전부터 진행하려는 내용이 모르는 것 투성이였기 때문에 두려움과 무기력함에 순조로운 진행이 되지 않았다.

그러나 우리가 넣어보고 싶은 기능들을 찾아보며 하나씩 사소한 것들부터 이뤄가면서 성취감을 얻고, 차근차근 진행할 수 있었다.
남들은 하찮은 프로젝트 결과물로 볼지 모르겠지만, 공모전이나 대외활동이 없었던 우리에겐 첫 값진 결과물이라 생각한다.
비록 졸업을 위한 프로젝트 였지만 여러 가지를 배울 수 있었던 시간이였다.

## 9. 참고 자료
http://www.inews24.com/view/1207360 - 아이뉴스24

https://blog.naver.com/kk04059/221652085977 - 네이버블로그 1인가구 통계자료

https://news.naver.com/main/read.nhn?oid=020&aid=0002866365 - 동아일보 cctv효과

https://m.post.naver.com/viewer/postView.nhn?volumeNo=23455754&memberNo=3185448&vType=VERTICAL - 네이버 지능형CCTV

http://www.cctvnews.co.kr/atl/view.asp?a_id=10590 - CCTV관제시스템 수요 요구와 개발 동향 
