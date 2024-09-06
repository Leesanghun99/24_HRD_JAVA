
scores : list = list()

while True:
    score: int = int(input("점수를 입력하세요:"))
    if score == -1: break
    scores.append(scores)

    print("총 과목들은 : ", scores)
    summation = 0
    for subject in scores:
        summation += subject

        print(f"총 점수는: {summation}")
        print(f"평균은 : {summation / len(scores)}")
