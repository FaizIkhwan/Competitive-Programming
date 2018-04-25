t = int(input())
for i in range(t):
    size = int(input())
    for column in range(size):        
        for row in range(size):
            if column == row or (column+row+1)==size:
                print('0',end=' ')
            else:
                print('1',end=' ')            
        print() # new line
