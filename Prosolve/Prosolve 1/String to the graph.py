#To count every words and replace it with *

t = int(input())
for i in range(t): #test case
    word = input().split() # sentence    
    for e in word: #pecah jadi word
        e = e.replace(",","")
        length = len(e)
        for n in range(0,length): #character in a word in terms of number
            print('*',end = '')
        print() #new line
        
