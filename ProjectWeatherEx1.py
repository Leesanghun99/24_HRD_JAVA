import requests
import xml.etree.ElementTree as ET
import openpyxl

# 1. 기상청 중기 예보 RSS URL
url = 'https://www.weather.go.kr/weather/forecast/mid-term-rss3.jsp'

# 2. requests를 사용하여 RSS 데이터 가져오기
response = requests.get(url)
response.encoding = 'UTF-8'  # 인코딩 설정

# 3. XML 데이터를 파싱하기 위해 ElementTree 사용
root = ET.fromstring(response.text)

# 4. 엑셀 파일 생성
wb = openpyxl.Workbook()
ws = wb.active
ws.title = 'Weather Forecast'

# 엑셀 헤더 설정 (날짜, 지역, 날씨, 최고/최저 기온 등)
ws.append(['날짜', '지역', '날씨', '최저 기온', '최고 기온'])

# 5. XML에서 날씨 데이터를 추출하여 엑셀에 저장
for location in root.iter('location'):
    region = location.find('city').text  # 지역명

    for data in location.iter('data'):
        date = data.find('tmEf').text  # 날짜
        weather = data.find('wf').text  # 날씨 상태
        min_temp = data.find('tmn').text  # 최저 기온
        max_temp = data.find('tmx').text  # 최고 기온

        # 엑셀에 행 추가
        ws.append([date, region, weather, min_temp, max_temp])

# 6. 엑셀 파일 저장
wb.save('weather_forecast.xlsx')

print("날씨 데이터가 엑셀 파일로 저장되었습니다.")