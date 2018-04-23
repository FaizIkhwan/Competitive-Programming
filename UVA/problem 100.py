#Max iterations between two numbers (num1,num2)

def counting(num):
    count = 0;
    while True:
        #print(int(num), end=' ')
        count = count + 1
        if num == 1:
            break
        if (num%2) == 0:
            num = num / 2
        elif num%2 == 1:
            num = 3 * num + 1
    return count

num1,num2 = input().split()
while num1!= '' and num2!='':
    max = counting(int(num1))
    for i in range(int(num1), int(num2)+1):
        total = counting(i)
        if total> max:
            max = total
    print(int(num1), int(num2), max)
    num1, num2 = input().split()
