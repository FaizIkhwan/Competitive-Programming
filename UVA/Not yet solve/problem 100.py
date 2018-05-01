#Max iterations between two numbers (num1,num2)
#TLE

def counting(num1,num2):
    res = 0;
    
    if num1 > num2:
        temp = num1
        num1 = num2
        num2 = temp
        
    for i in range(num1,num2+1):
        no = i
        cl = 0
        while no != 1:        
            cl += 1
            if (no%2) == 0:
                no = no / 2
            elif no%2 == 1:
                no = 3 * no + 1
        res = max(res, cl+1)
    return res


while True:
    try:
        num1,num2 = input().split()
    except EOFError:
        break
    else:
        print('{} {} {}'.format(num1, num2, counting(int(num1),int(num2))))
