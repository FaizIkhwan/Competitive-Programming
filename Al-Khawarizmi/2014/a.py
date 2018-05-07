# type: adhoc, easy
t = int(input())
for i in range(t):
    inp = str(input())
    alpha = 0
    numsymbol = 0    
    if len(inp)<8:
        print('Case #{}: Not acceptable'.format(i+1))
    else:
        for character in inp:
            if character.isalpha():
                alpha += 1
            elif character.isdigit() or not character.isspace():
                numsymbol += 1
        if alpha>0 and numsymbol>0:
            print('Case #{}: Acceptable'.format(i+1))
        else:
            print('Case #{}: Not acceptable'.format(i+1))
        
        
