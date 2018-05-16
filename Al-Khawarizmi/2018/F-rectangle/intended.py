# intended solution for this problem.
T = int(input())
for t in range(0, T):
  N = int(input())
  sum = ((N*(N+1)*(2*N+1))/6 + (N*(N+1))/2)//2
  sum = int(sum * sum)
  print(sum)
