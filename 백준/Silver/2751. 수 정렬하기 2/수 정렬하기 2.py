import sys


n = int(sys.stdin.readline())
arr = [int(sys.stdin.readline()) for _ in range(n)]

arr.sort()

for i in range(len(arr)):
    print(arr[i])