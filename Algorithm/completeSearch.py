import time

#complete search
def coin(v, coins):
    #base case
    if v <= 0:
        return 0
    #cari minimum coin dari subproblem
    #idea: tolak v dengan all possible coins dalam set
    min_coin = 1e9
    for c in coins:
        if c <= v:
            min_coin = min(min_coin, coin(v-c, coins)+1)
    return min_coin

start = time.time()
print(coin(7, [5,3,4,1]))
end = time.time()
print(start-end)
