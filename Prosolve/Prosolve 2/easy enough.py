# calculator
import math

cases = 1
t = int(input())
for i in range(t):
    x,y = input().split()    
    z = (int(x)**2) + math.sqrt(int(y))
    print('Cases',cases,': %.2f' %z)
    cases += 1
