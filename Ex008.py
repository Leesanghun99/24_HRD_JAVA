for _ in range(5):
    print (f"안녕하세용")
    print("#"* 100)

    for x in "안녕하세용":
        print(f"{x} : 안녕하세용.")

        for x in ['안', '녕하', '세', 0]:
            print('안')

            sum = 0
            for i in range(1,11):
                sum += i
                print(f"Summation: {sum}")
                print("#" * 100)

                for i in range(10):
                    print(i, end = " ")

                    print("#" * 100)
                    sum = 0
                    for i in range(100, 301, 5):
                        sum += i

                        print(f'5의 배수의 합 : {sum}')
                        print("#"* 100)

                        for i in range(100, 301):
                            if i % 3 == 0:
                               print(f'3의 배수 : {i}', end = "")

                            print("#"*100)
                            x: str = input("영어 입력 ")
                            for i in x:
                                print(i, end = "")


