hour, minute = map(int, input().split())

if (minute<45):
    if(hour==0):
        hour = 23
    else:
        hour-=1
    minute = minute+15
else:
    minute-=45
print(hour, minute)