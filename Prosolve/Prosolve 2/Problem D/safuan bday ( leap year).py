#Leap year
cases = 1
t = int(input())
for i in range(t):
    year = int(input())
    res = ''
    if (year % 4) == 0:
        if (year % 100) == 0:
            if (year % 400) == 0:
                res = 'Yes'
            else:
                res = 'No'
        else:
            res = 'Yes'
    else:
        res = 'No'
    print('Case {}:{}'.format(cases,res))
    cases += 1
    
