def generate666(n):
    count = 0
    i = 0
    while(True):
        if(str(i).__contains__('666')):
            count += 1
        if(count == n):
            return i
        i += 1

n = int(input())
print(generate666(n))