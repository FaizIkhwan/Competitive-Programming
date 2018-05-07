cases = 1
while True:
    num = []
    res = 0
    t = int(input())
    if t == 0:
        break
    else:
        for i in range(t):        
            inp = list(map(int,input().split()))
            num.append(inp)            
        res += num[0][0]
        for i in range(1,t-1):
            res += num[i][0] + num[i][-1]        
        for x in num[-1]:
            res += x
        print('Case #{}:{}'.format(cases,res))
        cases += 1
