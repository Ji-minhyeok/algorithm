def calculate(k,n):
    dp = [[0]*n for _ in range(k+1)]

    for i in range(n): #0층 초기화
        dp[0][i] = i+1

    for i in range(1,k+1):
        for j in range(n):
            dp[i][j] = dp[i][j-1]+dp[i-1][j]
    
    return dp[k][n-1]

caseNum = int(input())
for i in range(caseNum):
    k = int(input()) #층
    n = int(input()) #호
    print(calculate(k,n))