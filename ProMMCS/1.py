#14/6/2018
#easy

res = 1
myArr = []
i = 0
while True:
    inp = int(input())
    if inp == -1:
        break
    myArr.append(inp)
    if i >= 1:
        if myArr[i] < myArr[i-1]:
            res += 1            
    i += 1
print('The maximum number of balloons possible to catch is: {}'.format(res))
        
