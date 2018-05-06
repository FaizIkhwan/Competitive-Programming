t = int(input())
sum = 0
for i in range(t):
    inp = list(map(str,input().split()))    
    if inp[0] == 'report':
        print(sum)
    else:
        sum += int(inp[1])
    
