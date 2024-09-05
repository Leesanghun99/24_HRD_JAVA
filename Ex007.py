print('기능 선택')
print('1. 더하기')
print('2. 빼기')
print('3. 곱하기')
print('4. 나누기')
print()

s = input('계산기 기능을 선택하세요 (1/2/3/4): ')

number1 = int(input('첫번째 정수를 입력하세용: '))
number2 = int(input('두번째 정수르 입력하세용: '))

if s == '1':
    print('%d + %d = %d' % (number1,number2, number1+number2))
elif s == '2':
    print('%d - %d = %d' % (number1,number2, number1-number2))
elif s == '3':
    print('%d * %d = %d' % (number1,number2, number1*number2))
elif s == '4':
    print('%d / %d = %d' % (number1,number2, number1/number2))
else:
    print("결과값이 잘못됫습니당")
