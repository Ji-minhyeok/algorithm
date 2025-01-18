n, m = map(int,input().split())
cards = list(map(int,input().split()))
sumResult = []
resultIndex = 0

for i in range(len(cards)):
    for j in range(len(cards)):
        for k in range(len(cards)):
            if(i!=j and j!=k and i!=k and cards[i]+cards[j]+cards[k] <= m):
                sumResult.append(cards[i]+cards[j]+cards[k])

for i in range(len(sumResult)):
    if(m-sumResult[i] < m-sumResult[resultIndex]):
        resultIndex = i
print(sumResult[resultIndex])