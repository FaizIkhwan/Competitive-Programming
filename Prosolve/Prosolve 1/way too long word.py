'''
pneumonoultramicroscopicsilicovolcanoconiosis -> p43s
'''
t = int(input())
for i in range(t):
    word = input()
    count = 0
    first = ''
    last = ''
    if word == 'word':
        print('word')
    else:
        for countInChar in range(1,len(word)+1):
            count = countInChar            
        for characters in word:
            first = word[0]
            last = characters
        count = count - 2        
        print('{}{}{}'.format(first,count,last))        
