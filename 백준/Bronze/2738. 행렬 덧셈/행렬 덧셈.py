n, m = map(int, input().split())
arrA = []
arrB = []

for i in range(n):
    arrA.append(list(map(int, input().split())))
for i in range(n):
    arrB.append(list(map(int, input().split())))

for i in range(n):
    for j in range(m):
        print(arrA[i][j]+arrB[i][j],end=' ')
    print('')