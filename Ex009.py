i  = 1
sum = 0
while i <= 100:
    sum += i
    print(f"{i} : {sum}")
    i += 1

    print("총합은 : " , sum)
    index = len("Python")
    print("Python".upper())

    print("Python".lower())


    s = 'Python is widely used by a number of big companies'
    word = s.lower()
    print(word)
    i = 0
    count = 0
    size = len(word)
    while i < size:
        if word[i] == 'a' or word[i]  == 'e' or word[i] == "i" or \
            word[i] == 'o' or word[i] == 'u':
            print(f'모음 : {word[i]}')
            count += 1
            i += 1

            print(f"모음의 갯수는 : {count}")



