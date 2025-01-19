a = input()
b = input()
c = input()
i = -1

if(a != 'Fizz' and a != 'Buzz' and a!= 'FizzBuzz'):
    i = int(a)+3
elif(b != 'Fizz' and b != 'Buzz' and b != 'FizzBuzz'):
    i = int(b)+2
elif(c != 'Fizz' and c != 'Buzz' and c != 'FizzBuzz'):
    i = int(c)+1

if(i % 3 == 0 and i % 5 == 0):
    print("FizzBuzz")
elif(i % 3 == 0 and i % 5 != 0):
    print("Fizz")
elif(i % 3 != 0 and i % 5 == 0):
    print("Buzz")
else:
    print(i)