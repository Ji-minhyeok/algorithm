alphaMap = {}
result = 0
for i in range(ord('z')-ord('a')+1):
    alphaMap.update({chr(ord('a')+i):i+1})

n = int(input())
arr=input()

for i in range(len(arr)):
    result += alphaMap.get(arr[i])*(31**i)

print(result)