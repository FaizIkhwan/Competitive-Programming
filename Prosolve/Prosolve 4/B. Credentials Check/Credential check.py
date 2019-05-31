'''
Check if the username and password entered is 
in the database
'''
t1 = int(input())
up = []
for i in range(t1):
    data1 = input().split()
    up.append(data1)

t2 = int(input())
for i in range(t2):
    data2 = input().split()
    if data2 in up:
        print('YES')
    else:
        print('NO')