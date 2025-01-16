def findCode(inputCode):
    testCode = []
    for i in range(8):
        testCode.append(i+1)

    for i in range(8):
        if(testCode[i]!=inputCode[i]):
            break
        if(i==7):
            return 'ascending'
    for i in range(8):
        if(testCode[7-i]!=inputCode[i]):
            break
        if(i==7):
            return 'descending'
    return 'mixed'

inputCode = list(map(int,input().split()))
print(findCode(inputCode))
