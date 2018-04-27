#mirror the clock
t = int(input())
for i in range(t):
    hour, minute = input().split(':')
    if int(hour) == 12 and int(minute) == 00:        
        print('{}:{}'.format(hour,minute))    
    else:
        
