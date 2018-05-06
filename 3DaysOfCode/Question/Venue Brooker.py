#unsolve

t = int(input())
start = input().split()
end = input().split()
obj = list(zip(start,end))
res = []
obj.sort(key=lambda x: x[1])
res.append(obj[0])
print(obj)
for i in range(2,t):
    if obj[i][0] > obj[i-1][1]:
        print(obj[i][0])
        print(obj[i-1][1])
        res.append(obj[i])
print(res)
print(len(res))
