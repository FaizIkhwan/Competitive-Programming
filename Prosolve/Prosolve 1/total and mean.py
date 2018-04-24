# To calculate total and mean
t = int(input())
for i in range(t):
    data = input().split()
    total = 0
    for j in data:
        total += int(j)
    mean = total/10
    print('{} {}'.format(total, int(mean)))
