t = int(input())
for i in range(t):
    L, W, H = input().split()    
    if int(L)<=20 and int(W)<=20 and int(H)<=20:
        print('Case {}: good'.format(i+1))    
    else:
        print('Case {}: bad'.format(i+1))
