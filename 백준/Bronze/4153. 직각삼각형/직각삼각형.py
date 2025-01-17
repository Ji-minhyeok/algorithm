result = ''
while(True):
    a, b, c = map(int,input().split())
    if(a==0 and b==0 and c==0):
        break
    if(a>b):
        if(a>c):
            if(a**2 == (b**2+c**2)):
                result = 'right'
            else:
                result = 'wrong'
        else:
            if(c**2 == (b**2+a**2)):
                result = 'right'
            else:
                result = 'wrong'
    else:
        if(b>c):
            if(b**2 == (a**2+c**2)):
                result = 'right'
            else:
                result = 'wrong'
        else:
            if(c**2 == (a**2+b**2)):
                result = 'right'
            else:
                result = 'wrong'
    print(result)