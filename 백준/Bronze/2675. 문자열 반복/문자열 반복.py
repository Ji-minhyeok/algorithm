caseNum = int(input())

for i in range(caseNum):
    repeat, arr = map(str,input().split())
    for j in range(len(arr)):
        print(arr[j]*int(repeat),end='')
    print()