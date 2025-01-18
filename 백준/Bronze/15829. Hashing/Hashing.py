n = int(input())
arr = input()

M = 1234567891
r = 31
result = 0
power = 1

for i in range(n):
    value = ord(arr[i]) - ord('a') + 1
    result = (result + value * power) % M
    power = (power * r) % M

print(result)
