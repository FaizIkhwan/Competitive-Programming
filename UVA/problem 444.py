#Belum siap

strToTest = ''
while True:
    strToTest = input()
    check = False
    if strToTest == '':
        break
    else:
        check = strToTest.isalpha()        
        if check == True: #is alphabet, need to encode
            encoded = ''
            for characters in strToTest:
                decodingStr = ''.join(reversed(str(ord(characters))))                
                encoded = decodingStr + encoded
            print(encoded)        
        else: # is number, need to decode
            decoded = ''
            for characters in strToTest:
                                
