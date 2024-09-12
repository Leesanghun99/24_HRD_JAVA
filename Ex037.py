from random import randint

from Example.Ex036 import iteration

one_count = 0
two_count = 0
three_count = 0
four_count = 0
five_count = 0
six_count = 0
iteration = 0
number = 0
while iteration < 10_000:
    number = randint(a=1,b=6)
    if number == 1:
        one_count += 1
    elif number == 2:
        two_count += 1
    elif number == 3:
        three_count += 1
    elif number == 4:
        four_count += 1
    elif number == 5:
        five_count += 1
    else:
        six_count += 1
    iteration += 1
print(f"One Count : {one_count}")
print(f"Two Count : {two_count}")
print(f"Three Count : {three_count}")
print(f"Four Count : {four_count}")
print(f"Five Count : {five_count}")
print(f"Six Count : {six_count}")

print("\r\n")
print("*" * int(one_count / 100))
print("*" * int(two_count / 100))
print("*" * int(three_count / 100))
print("*" * int(four_count / 100))
print("*" * int(five_count / 100))
print("*" * int(six_count / 100))
