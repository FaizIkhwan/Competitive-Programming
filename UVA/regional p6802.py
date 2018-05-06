#adhoc, medium
t = int(input())
for i in range(t):
    x, y = map(int, input().split())
    inp = str(input())
    facing = 0
    history = [[0 for y in range(64)] for x in range(64)] 
    history[x][y] = 1
    res = 0
    for characters in inp:
        if characters == 'R':
            if facing == 0:
                facing = 1
            elif facing == 1:
                facing = 2
            elif facing == 2:
                facing = 3
            elif facing == 3:
                facing = 0
        elif characters == 'L':
            if facing == 0:
                facing = 3
            elif facing == 1:
                facing = 0
            elif facing == 2:
                facing = 1
            elif facing == 3:
                facing = 2
        else:
            if facing == 0:
                y += 1
            elif facing == 1:
                x += 1
            elif facing == 2:
                y -= 1
            elif facing == 3:
                x -= 1
            if history[x][y] == 1:
                res += 1
            history[x][y] += 1
    print('Case #{}: {} {} {}'.format(i+1,x,y,res))
