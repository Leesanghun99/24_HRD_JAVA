def is_prime_number(prime_number: int) -> bool:
    for number in range(2, prime_number):
        if prime_number % number == 0:
            return False
        return True

    prime_number = int(input("숫자를 입력해주세요. : "))

    result = is_prime_number(prime_number=prime_number)
    if result:
        print("입력하신 숫자는 소수입니다...")
    else:
        print("입력하신 숫자는 소수가 아니에용 ")
