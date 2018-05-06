t = int(input())
for i in range(t):
    inp = str(input())
    if len(inp) == 5:
        print('3')
    else:
        countOne = 0
        for character in inp:
            if character == 'o' or character == 'n' or character == 'e':
                countOne += 1
        countTwo = 0
        for character in inp:
            if character == 't' or character == 'w' or character == 'o':
                countTwo += 1
        res = 0
        if max(countOne,countTwo) == countOne:
            res = 1
        else:
            res = 2
        print(res)
