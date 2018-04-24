t = int(input())
for i in range(t):
    num = int(input())
    total = 1
    for j in range(1,num+1):
        total *= j
    print(total)
