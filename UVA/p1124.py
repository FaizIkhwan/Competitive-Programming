while True:
    try:        
        inp = input()
    except EOFError:
        break    
    else:
        print(inp)
