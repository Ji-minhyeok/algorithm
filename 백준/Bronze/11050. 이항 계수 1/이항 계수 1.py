def factorial(n):
    if(n == 1 or n == 0):
        return 1
    return n*factorial(n-1)

a, b = map(int,input().split())
facA = factorial(a)
facB = factorial(b)
facA_B = factorial(a-b)

print(facA//(facB*facA_B))