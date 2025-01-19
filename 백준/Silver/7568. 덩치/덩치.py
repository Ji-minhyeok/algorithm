n = int(input())
info = []
for i in range(n):
    info.append(list(map(int, input().split())))

for i in range(n):
    result = 1
    for j in range(n):
        if(info[i][0] < info[j][0] and info[i][1] < info[j][1]):
            result += 1
    print(result, end=' ')