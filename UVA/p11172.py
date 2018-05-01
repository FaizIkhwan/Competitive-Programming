t = int(input())
for i in range(t):
    num1, num2 = map(int,input().split())
    if num1 > num2:
        print('>')
    elif num1 < num2:
        print('<')
    elif num1 == num2:
        print('=')
