#Count mean and median

num = input().split()
num2 = list(map(int,num))
mean = sum(num2)/len(num2)

print(num2)
median = num2[int(len(num2)/2)]
print('Mean : %.2f' %mean)
print('Median : %.2f' %median)