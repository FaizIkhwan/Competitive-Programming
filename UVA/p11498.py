while True:
    n = int(input())
    if n == 0:
        break
    x,y = map(int,input().split())
    for i in range(n):
        xx,yy = map(int,input().split())
        if xx == x or yy == y:
            print('divisa')
        elif xx>x and yy>y:
            print('NE')
        elif xx>x and yy<y:
            print('SE')
        elif xx<x and yy>y:
            print('NO')
        else:
            print('SO')
