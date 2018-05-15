# adhoc, easy
vowel = ['a','e','i','o','u']
t = int(input())
for i in range(t):
    str1, str2 = list(input().split())
    if len(str1) != len(str2):
        print('Case #{}: different'.format(i+1))
        continue
    res = True
    for c in range(len(str1)):
        if (str1[c] in vowel) and (str2[c] in vowel):
            res = True
        elif (str1[c] not in vowel) and (str2[c] not in vowel):
            res = True
        else:
            res = False
            break
    if res:
        print('Case #{}: same'.format(i+1))
    else:
        print('Case #{}: different'.format(i+1))
        
