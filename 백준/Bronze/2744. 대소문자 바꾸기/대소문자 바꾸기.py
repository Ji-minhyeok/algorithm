a = input()
result = ""
difValue = ord('a')-ord('A')

for i in a:
    if ord(i)<ord('a'):
        result += chr(ord(i)+difValue)
    else:
        result += chr(ord(i)-difValue)

print(result)