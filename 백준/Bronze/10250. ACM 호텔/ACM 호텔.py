caseNum = int(input())
for testNum in range(caseNum):
    h, w, n = map(int, input().split())

    roomArr = []

    for i in range(1,w+1):
        for j in range(1,h+1):
            roomArr.append(str(j)+format(i,'02'))
    print(roomArr[n-1])