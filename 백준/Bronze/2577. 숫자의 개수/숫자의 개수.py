a = int(input())
b = int(input())
c = int(input())
result = a*b*c
result = str(result)
arr = [0 for i in range(10)]
for i in range(len(result)):
    temp = int(result[i])
    arr[temp]+=1
for i in range(10):
    print(arr[i])