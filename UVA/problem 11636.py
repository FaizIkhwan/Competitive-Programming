#DONE
cases = 1
while True:
    num = int(input())
    i = 2
    count = 0
    remainder = 0    
    if num<0:
        break
    elif num == 1 or num == 0:
        print('Case {}: 0'.format(cases))
    else:            
        while i<num:
            count +=1
            i *= 2
        remainder = num - i/2;
        if remainder < i and remainder != 0:
            count +=1                                        
        print('Case {}: {}'.format(cases,count))
    cases += 1
