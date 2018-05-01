t = int(input())
str1 = ['a','d','g','j','m','p','t','w',' ']
str2 = ['b','e','h','k','n','q','u','x']
str3 = ['c','f','i','l','o','r','v','y']
str4 = ['s','z']
for i in range(t):
    inp = input()
    res = 0
    for characters in inp:
        if characters in str1:
            res += 1
        elif characters in str2:
            res += 2
        elif characters in str3:
            res += 3
        elif characters in str4:
            res += 4
    print('Case #{}: {}'.format(i+1,res))
