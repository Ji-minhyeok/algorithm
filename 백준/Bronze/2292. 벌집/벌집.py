n = int(input())
rayer = 0
limit = -1
limitMul = 0
pibo = 0
while(True):
    if(n<=limit):
        print(rayer)
        break
    else:
        limitMul = limitMul + pibo
        limit = limitMul * 6 + 1
        rayer += 1
        pibo += 1