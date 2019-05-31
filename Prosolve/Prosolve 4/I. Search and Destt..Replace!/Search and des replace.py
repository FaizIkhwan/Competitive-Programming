#Replace 's' character with 'r' character in the string

ori = input()
t = int(input())
for i in range(t):
    s,r = input().split()
    ori = ori.replace(s,r)
print(ori)
