name = '이상헌'
scores = {'kor': 90, 'eng' : 95,'math':95, 'science': 88}
print(scores)

scores['kor'] = 70
print(scores['kor'])

scores['music'] = 100
print(scores)

del scores['science']
print(scores)

print('이름 : %s' % name)
print('국어 : %s' % scores['kor'])
print('영어 : %s' % scores['eng'])
print('수학 : %s' % scores['math'])
