d = {}
ok = False
n = int(input())
for i in range(n- 1) :
    x, y = map(int, input().split())
    if x in d :
        d[x] += 1
    else :
        d[x] = 1
    if y in d :
        d[y] += 1
    else :
        d[y] = 1
    if d[x] == n - 1 or d[y] == n - 1 :
        ok = True

print('Yes' if ok else 'No')