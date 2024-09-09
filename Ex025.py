mininum = 0
maxinum = 0
input_value1 = int(input('첫번째 입력  '))
input_value2 = int(input('두번째 입력  '))

def find_gcm(input_value:int, input_value2:int) ->int:
    if input_value1 > input_value2:
        maxinum = input_value1
        else:
        mininum = input_value2
gcm = 0
for number in range(2, mininum + 1):
    if input_value1 % number == 0 and input_value2 % number:
        gcm = number



find_gcm(input_value2=input_value2, input_value1=input_value1)
print(f"최대공약수는 : {gcm}")