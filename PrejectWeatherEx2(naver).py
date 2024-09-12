import requests
from bs4 import BeautifulSoup
import openpyxl

# 1. 네이버 날씨 페이지 URL (대구 지역으로 변경됨)
url = 'https://weather.naver.com/today/07110109'

# 2. 웹 페이지 가져오기
response = requests.get(url)
soup = BeautifulSoup(response.text, 'html.parser')

# 3. 각 항목 추출 함수
def get_value_or_default(selector):
    """HTML 요소를 찾고 텍스트를 반환하거나 'N/A' 반환"""
    element = soup.select_one(selector)
    return element.get_text().strip() if element else 'N/A'

# 4. 각 데이터 추출
# 현재 온도
temperature = get_value_or_default('.weather_graphic .temperature_text')

# 최고/최저 기온
low_temp = get_value_or_default('.low .temperature')
high_temp = get_value_or_default('.high .temperature')

# 습도
humidity = get_value_or_default('.summary_list .item_humidity .desc')

# 날씨 상태
weather = get_value_or_default('.weather_graphic .summary')

# 미세먼지 (PM10)
pm10 = get_value_or_default('.today_chart_list .item_pollution .level_text')

# 5. 엑셀 파일 생성
wb = openpyxl.Workbook()
ws = wb.active
ws.title = 'Naver Weather'

# 엑셀 헤더 설정
ws.append(['Temperature', 'Low Temperature', 'High Temperature', 'Humidity', 'Weather', 'PM10'])

# 6. 데이터를 엑셀에 추가
ws.append([temperature, low_temp, high_temp, humidity, weather, pm10])

# 7. 엑셀 파일 저장
wb.save('naver_weather_dagu.xlsx')

print("네이버 날씨 데이터가 엑셀 파일로 저장되었습니다.")