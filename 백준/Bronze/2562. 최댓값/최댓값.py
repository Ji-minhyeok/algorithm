arr = []
maxNum=-1
maxNumIndex = ''
for i in range(9):
    arr.append(int(input()))

for i in range(len(arr)):
    if maxNum<arr[i]:
        maxNum=arr[i]
maxNumIndex = arr.index(maxNum)
print(maxNum)
print(maxNumIndex+1)