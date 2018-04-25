# BELUM SIAP

print(ord('z'))
t = int(input())
inp = ''
inp = input()
for characters in inp:
    if characters == ' ':
        print(' ', end='')
    else:
        print( chr(ord(characters) + t), end='' )
