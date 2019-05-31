'''
count
'hello'
in
'hello hello abc hi ais kacang hi'
'''
s = input('Enter a string: ')
T = int(input('Enter test case: '))

for i in range(T):
    word = input('Enter a word to search: ')
    occurances = s.count(word)
    print(occurances)