t = int(input())
for i in range(t):
    inp = int(input())
    inp = inp ** 3
    even = False
    odd = False
    for j in str(inp):
        if int(j)%2 == 0:
            even = True
        elif int(j)%2 == 1:
            odd = True
    if even and odd:
        print('Case #{}: MIXED'.format(i+1))
    elif even:
        print('Case #{}: EVEN'.format(i+1))
    elif odd:
        print('Case #{}: ODD'.format(i+1))
