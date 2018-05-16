# simulation, easy sikit
while True:
    n, m = map(int, input().split())
    if n == 0 and m == 0:
        break
    table = [i for i in range(1,n+1)]

    i = (m-1) % len(table)
    while len(table) > 1:
        del table[i]
        i = i-1 # reset index
        i = (i+m) % len(table)

    print(table[0])
