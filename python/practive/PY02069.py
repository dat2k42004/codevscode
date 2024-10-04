def reversible(n) :
    if n < 10 :
        return False
    if str(n) == str(n)[ :: -1] :
        return True
    return False
n, m = map(int, input().split())

a = []
res = -1
for i in range(n) :
    l = [int(x) for x in input().split()]
    for j in l :
        if reversible(j) and j > res :
            res = j
    a.append(l)
if res != -1 :
    print(res)
    for i in range(n) :
        for j in range(m) :
            if a[i][j] == res :
                print('Vi tri [{}][{}]'.format(i, j)) 
else :
    print('NOT FOUND')
