inputArr = []
result = 10
for i in range(10):
    inputArr.append(int(input())%42)

for i in range(10):
    for j in range(i,10):
        if(i!=j and inputArr[i]==inputArr[j]):
            result -= 1
            break
if(result==0):
    result = 1
print(result)