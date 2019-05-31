inp = input()
symbol = 'abcdefghijklmnopqrstuvwxyz'
for i in symbol:
    if str(i) in str(inp):
        print('{}:{}'.format(i, inp.count(i)))
