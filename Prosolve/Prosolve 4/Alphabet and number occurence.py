# Count how many alphabet and digit

t = int(input('Enter test case: '))

for i in range(t):

    a = 0
    d = 0
    s = input('Enter string: ')

    for character in s:
        if character.isalpha():
            a += 1
        if character.isdigit():
            d += 1

    print('Alphabet: {}, Digit: {}'.format(a, d))