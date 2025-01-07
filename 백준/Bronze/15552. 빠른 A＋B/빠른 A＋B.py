import sys
length = int(input())
for i in range(length):
    a, b = map(int, sys.stdin.readline().strip().split())
    print(a+b)