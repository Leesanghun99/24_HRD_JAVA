def even_odd(number: int) -> str:
    result = ""
    if number % 2 == 1:
        result = "홀수 입니다."
    else:
        result = "짝수 입니다."
    return result
print(even_odd(number= 5))
