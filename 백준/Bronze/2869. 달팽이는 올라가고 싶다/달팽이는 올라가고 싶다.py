def calculate(day, night, hight):
    result = (hight - night) // (day - night)

    if((hight - night) % (day - night) != 0):
        result += 1
    return result

day, night, hight = map(int,input().split())
print(calculate(day, night, hight))