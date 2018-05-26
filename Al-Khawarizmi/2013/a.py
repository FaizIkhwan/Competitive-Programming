def fact(num):
    total = 1
    for i in range(1,num+1):
        total *= i
    return total

cases = 1
while True:
    inp = input()
    if int(inp) == 0:
        break
    tostr = str(fact(int(inp)))[::-1]
    res = 0
    for character in tostr:
        if character != '0':
            break
        res += 1
    print('Case #{}: {}'.format(cases, res))
    cases += 1
