cases = 1
month = ['Jan','Feb','Mar','Apr','May','Jun','Jul','Aug','Sep','Oct','Nov','Dec']
while True:
    graph = [0]*13
    t = int(input())
    if t == 0:
        break    
    for i in range(t):    
        d, m, y = map(int,input().split())    
        graph[m] += 1
    print('Case #{}:'.format(cases))
    for j in range(len(month)):
        print('{}:'.format(month[j]), end='')        
        for n in range(graph[j+1]):
            print('*',end='')
        print()
    cases += 1
