n = int(input())
shirts = list(map(int, input().split()))
t, p = map(int,input().split())
tResult=0
pResult = [0 for i in range(2)]

for i in range(len(shirts)):
    tResult+=shirts[i]//t
    if(shirts[i]%t!=0):
        tResult+=1

pResult[0]=n//p
pResult[1]=n%p
print(tResult)
print(pResult[0], pResult[1])