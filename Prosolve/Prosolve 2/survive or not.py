# display the middle input
t = int(input())
cases = 1
for i in range(t):
    inp = input().split()
    inp.sort()
    print('Case {}:{}'.format(cases,inp[1]))
    cases += 1
