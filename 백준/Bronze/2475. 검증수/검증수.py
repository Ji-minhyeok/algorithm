arr = list(map(int, (input().split())))
arrSum = 0
for i in range(len(arr)):
    arrSum += arr[i]**2
print(arrSum%10)