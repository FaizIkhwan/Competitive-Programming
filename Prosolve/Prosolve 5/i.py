import string
t = int(input())
for i in range(t):
    inp = str(input())
        
    print(inp.lower())
    print(inp.upper())
    capitalFront = inp[0].upper()
    print('{}{}'.format(capitalFront,inp[1:])) # char at 0
    print(inp.swapcase())
    print(string.capwords(inp))

