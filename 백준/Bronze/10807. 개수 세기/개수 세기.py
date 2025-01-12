a = int(input())
arr = list(map(int,input().split()))
v = int(input())
result = 0
for i in range (len(arr)):
    if(arr[i] == v):
        result+=1
print(result)