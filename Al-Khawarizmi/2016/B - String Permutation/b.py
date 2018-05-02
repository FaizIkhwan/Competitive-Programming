import itertools

t = int(input())
for i in range(t):
    inp = input()
    items = map(list, itertools.permutations(inp))
    print('Case # {}:'.format(i+1))
    for res in items:
        print(''.join(res))
