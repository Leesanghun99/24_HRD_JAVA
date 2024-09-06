V = [[1,2,3],[4,5,6],[7,8,9]]

for i in range(0,3): #row
    for j in range(0,3): # column
        scalar = V[i][j]
        print(scalar, end="\t")
        print()


animals: list = ['사자', '호랑이', '사슴', '곰']
index = 0
size = len(animals)
while index < size:
    animal:str = animals[index]
    print(animal, end=", ")
    index += 1 # ++index, index++ 없음.
