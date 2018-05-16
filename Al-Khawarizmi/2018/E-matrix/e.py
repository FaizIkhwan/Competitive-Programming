# adhoc, easy
cases = 1
while True:
    matrixOne = []
    matrixTwo = []
    m, n, p, q = map(int,input().split())

    if m == 0 and n == 0 and p == 0 and q == 0:
        break
    elif n != p:
        print('Case #{}:'.format(cases))
        print('undefined')
    else:
        for i in range(m):
            inpMatrixOne = input().split()
            matrixOne.append(inpMatrixOne)
        for i in range(p):
            inpMatrixTwo = input().split()
            matrixTwo.append(inpMatrixTwo)
    
        res = [[sum(int(a)*int(b) for a,b in zip(X_row, Y_col)) for Y_col in zip(*matrixTwo)] for X_row in matrixOne]
        print('Case #{}:'.format(cases))
        for r in res:
            print('| ',end='')
            for value in r:
                print(value,end=' ')
            print('|',end='')
            print()
        cases += 1
