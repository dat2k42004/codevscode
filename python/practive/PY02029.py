def cmp(x) :
    return x
m, n = map(int, input().split())

a = [int(x) for x in input().split()]

f = [0] * n
for i in a :
    f[i - 1] += 1
g = [x for x in f]
f.sort(key = cmp, reverse = True)
res = f[0]
for i in range(1, len(f)) :
    if f[i] > 0 and f[i] != res :
        res = f[i]
        break
if res == f[0] :
    print('NONE')
else :
    for i in range(len(g)) :
        if g[i] == res :
            print(i + 1)
    

