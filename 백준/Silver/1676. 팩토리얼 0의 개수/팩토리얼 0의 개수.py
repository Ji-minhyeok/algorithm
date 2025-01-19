def findZero(n):
    facNumStr = str(factorial(n))
    result = 0
    for i in range(len(facNumStr)-1 , -1 , -1):
        if(facNumStr[i] == '0'):
            result += 1
        else:
            return result


def factorial(n):
    if(n==0 or n==1):
        return 1
    return n*factorial(n-1)

n = int(input())

print(findZero(n))