'''
display approved or not according to the budget
'''

t = int(input())
for i in range(t):
    student, venue, food, transport, other = input().split()
    total = int(venue) + int(food) + int(transport) + int(other)
    student = int(student)
    if student>0 and student<=20:
        if total>=2000:
            print('DENIED')
        else:
            print('APPROVED')
    elif student>=21 and student<=50:
        if total>=4000:
            print('DENIED')
        else:
            print('APPROVED')
    elif student>50:
        if total>=10000:
            print('DENIED')
        else:
            print('APPROVED')
        
    
