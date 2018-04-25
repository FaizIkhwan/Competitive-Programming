t = int(input())
cases = 1
for i in range(t):
    inp = int(input())
    total = 1
    for j in range(1,inp+1):
        total *= j
    print('Case {}: {}'.format(cases,total))
    cases += 1
