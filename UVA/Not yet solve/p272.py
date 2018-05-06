#unsolve
while True:
    tex = True
    try:
        inp = list(input())
    except EOFError:
        break    
    for n in range(len(inp)):
        if inp[n] == '\"':
            if tex:
                inp[n] = "``"
            else:
                inp[n] = "''"                        
            tex = not (tex)          
    print(''.join(inp))    
