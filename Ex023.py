def besu5(n) :
    if n % 5 == 0:
        rel = True
    else :
        rel = False

        return rel

    num = int(input('양의 정수를 입력하세용: '))
    result = besu5(num)

    if result == True :
        print('%d -> 5의 배수이다.' % num)
    else :
        print('%d -> 5의 배수가 아니다.' % num)