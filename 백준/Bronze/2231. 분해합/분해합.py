def calNum(n):
    for i in range(n):
        compareNum = 0
        temp = 0
        compareNum += i
        temp = str(i)
        for j in range(len(temp)):
            compareNum+=int(temp[j])
        if(compareNum == n):
            return(i)
    return(0)
        
n = int(input())
print(calNum(n))