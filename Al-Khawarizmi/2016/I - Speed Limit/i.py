# easy 
while True:
    t = int(input())
    speedData = []
    timeData = []
    if t == -1:
        break
    else:
        for i in range(t):
            s, et = map(int,input().split())
            speedData.append(s)
            timeData.append(et)    
        res = 0
        time = 0
        for i in range(t):
            res += (speedData[i] * (timeData[i] - time) )
            time = timeData[i]
        print('{} miles'.format(res))
        
