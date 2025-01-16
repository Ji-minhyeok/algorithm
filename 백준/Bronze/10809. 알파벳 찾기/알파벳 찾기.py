alphaArr = []
for i in range(ord('a'),ord('z')+1):
    alphaArr.append(chr(i))

result = [-1 for i in range(len(alphaArr))]
inputStr = input()
for i in range(len(alphaArr)):
    for j in range(len(inputStr)):
        if(alphaArr[i]==inputStr[j]):
            if(result[i]==-1):
                result[i]=j

print(*result)