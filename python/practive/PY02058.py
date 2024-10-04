a = []
res1 = -1
res2 = 10001
n, m = map(int, input().split())
for i in range(n) :
    l = [int(x) for x in input().split()]
    for j in l :
        res1 = max(res1, j)
        res2 = min(res2, j)
    a.append(l)
res = res1 - res2   
# print(res)
ok = False
cnt = False

for i in range(n) :
    for j in range(m) :
        if a[i][j] == res :
            if cnt :
                print('Vi tri [{}][{}]'.format(i, j))
            else :
                ok = True
                cnt = True
                print(res)
                print('Vi tri [{}][{}]'.format(i, j))
                
if not(ok) :
    print('NOT FOUND')
