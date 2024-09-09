# 소비형 함수
# Consumer function

def function(param_name: int) -> None:
    result = param_name + 10             #전역공간
    print(result)                   #전역공간(전역함수)
result = function(param_name=10)     # =부호는 가독성을 위해 써주는게 좋다.
print(type(result))


# 생산형 Supplier

def supply_function() -> tuple:
    (x,y) =(10,20)
    print(sum)
    return (x, y)

result = supply_function()
print(result)

# 함수형 functional

def functional_function(param: int) -> int:
    result = param + 1_000
    return result

result = functional_function(param = 100)
print(result)

#Shop, display function

def show_function():
    print("잔액 : 2000")
    print("계좌 : 2090-10-222")
    print("계죄입금 불가능")
    print("계좌출금 불가능")

    show_function()

    def swapping_values(value1: int, value2: int) -> tuple:
        return (value2, value1)


def swapping_values(param, param1):
    pass


result2 = swapping_values(1_234, 4_321)
print(result2)
