# Adhoc, super easy
cases = 1
while True:
    inp = input()
    if inp == '*':
        break
    else:
        if inp == 'Hajj':
            print('Case {}: Hajj-e-Akbar'.format(cases))
        else:
            print('Case {}: Hajj-e-Asghar'.format(cases))
    cases += 1
