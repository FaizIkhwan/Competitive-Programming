'''
Change 
'do you come in peace'
		to
'peace in come you do'
'''
str1 = 'do you come in peace'
str2 = ''
for sentence in str1.split():    
    str2 = sentence + ' ' + str2
print(str2)
    
