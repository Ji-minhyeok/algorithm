n = int(input())
info = []
for i in range(n):
    info.append(list(input().split()))

info.sort(key = lambda x: int(x[0]))

for i in range(len(info)):

    print(info[i][0], info[i][1])
