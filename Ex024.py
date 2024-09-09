def calculate_volume(radius: float, height: float) -> float :
    return (radius ** 2 * 3.14 * height)

radius = float(input("반지름의 길이는?? : "))
height = float(input("높이는?? : "))
volume = calculate_volume(radius=radius, height=height)
print(f"엔진의 실린더의 부피는 : {volume}")

