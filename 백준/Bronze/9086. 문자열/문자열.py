caseNum = int(input())

for i in range(caseNum):
    inputString = input()
    result = inputString[0]
    result += inputString[len(inputString)-1]
    print(result)