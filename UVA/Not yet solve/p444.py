#Belum siap

strToTest = ''
while True:
    strToTest = input()
    check = False
    if strToTest == '':
        break
    else:
        check = strToTest.isalpha()        
        if check == True: #is alphabet, need to ENCODE
            encoded = ''
            for characters in strToTest:
                decodingStr = ''.join(reversed(str(ord(characters))))                
                encoded = decodingStr + encoded
            print(encoded)        
        else: 
            decoded = ''
            threeDigit =  ''
            countThree = 10 # off mode
            twoDigit = ''
            subStringed = ''
            i = 0
            j = 1
            reversing = ''.join(reversed(strToTest))
            print(reversing)
            while i<len(reversing):                
                if reversing[i] == '1':
                    j = 3                                    
                else:
                    j = 2                    
                print('i:{}, i+j:{}'.format(i,(i+j)))
                subStringed = reversing[i:i+j]
                print(subStringed)
                print(type(subStringed))
                decoded = ''.join(reversed(chr(int(subStringed))))
                print(decoded)
                i += 1
                
                    
                                
