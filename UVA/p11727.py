t = int(input())
for i in range(t):
    num = input().split()
    num.sort()
    print('Case {}: {}'.format(i+1,num[1]))
