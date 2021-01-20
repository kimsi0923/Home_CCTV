import sys
from sdk.api.message import Message
from sdk.exceptions import CoolsmsException

def sendText():

    api_key = "NCSMPOKT8MGWCNYM" #악용방지를 위해 현재는 비활성 상태
    api_secret = "X7PPH2PQ7C8ZTGUIMEEM5UB1OZGAFKV3"

    params = dict()
    params['type'] = 'sms'
    params['to'] = '-' #수신자(사용자) 번호 입력 
    params['from'] = '-' #발신자(개발자 혹은 사용자) 번호 입력
    params['text'] = '도둑이 침입하였습니다!'

    cool = Message(api_key, api_secret)

    try:
        response = cool.send(params)
        print("Success Count : %s" % response['success_count'])
        print("Error Count : %s" % response['error_count'])
        print("Group ID : %s" % response['group_id'])

        if "error_list" in response:
            print("Error List : %s" % response['error_list'])

    except CoolsmsException as e:
        print("Error code : %s" % e.code)
        print("Error Message : %s" % e.msg)
