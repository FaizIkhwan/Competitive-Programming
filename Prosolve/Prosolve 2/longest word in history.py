#count vowel and consonant

t = int(input())
vowel = ['a','A','e','E','i','I','o','O','u','U']
cases = 1
for i in range(t):
    inp = input()
    countVowel = 0
    countConsonant = 0
    for c in inp:
        if c in vowel:
            countVowel += 1
        else:
            countConsonant += 1
    print('Case {}:{} {}'.format(cases,countVowel,countConsonant))
    cases += 1


