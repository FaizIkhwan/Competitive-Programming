t = int(input())
for i in range(t):
    inp = str(input())    
    if list(inp) == list(reversed(inp)):
        print('Case #{}: Yes'.format(i+1))
    else:
        print('Case #{}: No'.format(i+1))
