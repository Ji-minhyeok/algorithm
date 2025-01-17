n = int(input())
arr = list(map(int,input().split()))
count = 0
for i in range(len(arr)):
    for j in range(2,1001):
        if(arr[i]%j==0 and arr[i]!=j):
            break
        if(arr[i]==j):
            count+=1
print(count)