testCase = int(input())

for i in range(testCase):
    inputStr = input()
    middleScore = 0
    score = 0
    for j in range(len(inputStr)):
        if(inputStr[j]=='O'):
            middleScore += 1
            score += middleScore
        else:
            middleScore = 0
    print(score)