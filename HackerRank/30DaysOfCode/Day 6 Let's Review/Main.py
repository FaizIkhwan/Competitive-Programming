t = int(input())
for i in range(t):
    str1 = input(str())
    even = str()
    odd = str()
    for i in range(len(str1)):
        if i % 2 == 0:
            even = even + str1[i]
        elif i%2 != 0:
            odd = odd + str1[i]
    print(even,odd)