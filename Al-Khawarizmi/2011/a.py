t = int(input())
for i in range(t):
    inp = int(input())
    res = 0
    for j in range(1,inp+1):
        if j%2 != 0: # Odd
            res += j
    print(res)
