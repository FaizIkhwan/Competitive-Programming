# To find localExtrema = localMinima + localMaxima

t = int(input())
localExtrema = 0
localMinima = 0
localMaxima = 0

num = input().split()
    
for i in range(len(num)):
    if i != 0 and i != (t-1):
        if (num[i]<num[i-1]) and (num[i]<num[i+1]):
            localMinima += 1
        if (num[i]>num[i-1]) and (num[i]>num[i+1]):
            localMaxima += 1
        localExtrema = localMinima + localMaxima
print('Local Exima:',localExtrema)
