# adhoc, easy
def virus(inp):
    m = inp + 1
    num = [0] * m
    for i in range(1,m):
        if i <= 2:
            num[i] = 1
        else:
            num[i] = num[i-1] + num[i-2]
    return num[inp]

while True:
    inp = int(input())
    if inp == -1:
        break
    else:
        print('Hour {}: {} cow(s) affected'.format(inp, virus(inp)))
