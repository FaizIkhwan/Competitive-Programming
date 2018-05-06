cases = 1
while True:
    inp = input()    
    if inp == '#':
        break
    else:
        if inp == 'HELLO':
            print('Case {}: ENGLISH'.format(cases))
        elif inp == 'HOLA':
            print('Case {}: SPANISH'.format(cases))
        elif inp == 'HALLO':
            print('Case {}: GERMAN'.format(cases))
        elif inp == 'BONJOUR':
            print('Case {}: FRENCH'.format(cases))
        elif inp == 'CIAO':
            print('Case {}: ITALIAN'.format(cases))
        elif inp == 'ZDRAVSTVUJTE':
            print('Case {}: RUSSIAN'.format(cases))
        else:
            print('Case {}: UNKNOWN'.format(cases))
    cases += 1
