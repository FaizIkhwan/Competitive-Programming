# easy, adhoc math
t = int(input())
for i in range(t):
    inp = list(map(int,input().split()))
    del inp[0]
    inp.sort()
    res = 0
    for j in range(len(inp)-1):
        if (inp[j+1]-inp[j])>res:
            res = (inp[j+1]-inp[j])
    print('Class {}'.format(i+1))
    print('Max {}, Min {}, Largest gap {}'.format(max(inp),min(inp),res))
            
