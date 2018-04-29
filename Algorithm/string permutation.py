def permute(combine, left):
    if len(left) == 0:
        print(combine)
        return
    for i in range(len(left)):
        permute(combine + left[i], left[:i] + left[i+1:])



permute("","abc")

            
