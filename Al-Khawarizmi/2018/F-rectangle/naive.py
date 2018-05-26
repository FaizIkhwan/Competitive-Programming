# not my code
# naive solution to verify samples
T = int(input())
for t in range(0, T):
  sum = 0
  N = int(input())
  for i in range(0,N):
    for j in range(0, N):
      for k in range(i+1, N+1):
        for l in range(j+1, N+1):
          sum = sum + (k-i)*(l-j)
  print(sum)

