import sys
n = int(input())
arr = [0 for i in range(10001)]

for _ in range(n):
    arr[(int(sys.stdin.readline()))] += 1

for i in range(len(arr)):
    if (arr[i] != 0):
        for j in range(arr[i]):
            print(i)