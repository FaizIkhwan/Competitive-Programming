t = int(input())
for i in range(t):
    inp = input().split()
    for words in inp:
        words = words.replace(';','')
        for characters in range(0,len(words)):
            print('*', end='')
        print() #new line
