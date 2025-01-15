n = int(input())
arr = list(map(int,input().split()))
minNum = arr[0]
maxNum = arr[0]
for i in range(1, n):
    if(arr[i]<minNum):
        minNum=arr[i]
    elif(arr[i]>maxNum):
        maxNum=arr[i] 
print(minNum, maxNum)