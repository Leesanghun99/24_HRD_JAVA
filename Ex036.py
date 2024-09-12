from random import randint
my_win_count = 0
your_win_count = 0
iteration = 0
while iteration < 500:
    #print(randint(1, 6))
    my_dice = randint(1,6)
    your_dice = randint(1,6)
    print(f'My dice : {my_dice}')
    print(f'Your dice : {your_dice}')
    if my_dice > your_dice:
        print("이겼습니다!")
    elif my_dice == your_dice:
        print("무승부 입니다.")
    else :
        # print('상대방의 승리...')
        iteration += 1
        # input()
        print("*" * my_win_count)
        print("@" * your_win_count)