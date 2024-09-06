
flowers = ['할미꽃', '무궁화', '장미', '아이리스',]
flowers.append('국화')
flowers.sort()
print(flowers)
flowers.reverse()
print(flowers)
# flowers.clear()
# flower = '믈망초'
# new_flowers = flowers + flower
# print(new_flowers)

scores = []

while True :
    score = int(input('성적을 입력하세요(종료 시 -1 입력): '))

    if score == -1 :
        break
    else :
        scores.append(score)

        print('%s' % scores)


