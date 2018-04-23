# A - starting point, B - End(inclusive, C - increment

T = int(input())

for i in range(T):
    
    A, B, C = map(int, input().split(" "))    
    
    for n in range(A, B+1, C):
        print(n, end=" ")

    print("") # new line
