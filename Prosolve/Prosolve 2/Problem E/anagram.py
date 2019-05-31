#Anagram

cases = 1
t = int(input())
for i in range(t):
    str1, str2 = input().split()        
    if sorted(str1) == sorted(str2):
        print('Cases {}: Yes'.format(cases))
    else:
        print('Cases {}: No'.format(cases))
    cases += 1
