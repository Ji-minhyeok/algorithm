n = int(input())
score = list(map(int,input().split()))
result = 0.0
max = score[0]

for i in range(1, len(score)):
    if(max < score[i]):
        max = score[i]

for i in range(len(score)):
    result += score[i] / max * 100

result = result / n

print(result)