#adhoc, easy

cases = 1
while True:
    t = int(input())
    if t == 0:
        break
    tc = 0
    tb = 0
    tl = 0
    tn = 0
    for i in range(t):
        c, b, l, n = map(int, input().split())
        tc += c
        tb += b
        tl += l
        tn += n
    spice = (tc+tb+tl)/85 * 8
    modal = tc/85*7.5 + tb/85*24 + tl/85*32 + 0.2*tn + spice
    sellingprice = tc*0.8 + tb*1.0 + tl*1.2 + tn*0.8
    res = sellingprice - modal
    print('Case #{}: {}'.format(cases, round(res,2)))
    cases +1
    
