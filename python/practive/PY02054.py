n, m = map(int, input().split())

a = []
for i in range(n) :
    l = [int(x) for x in input().split()]
    a.append(l)
f = []
j = 0
for i in range(abs(n - m)) :
    f.append(j)
    j += 2
       
if n > m :
    for i in range(n) :
        if i in f :
            continue
        for j in range(m) :
            print(a[i][j], end = ' ')
        print()
else :
    for i in range(n) :
        for j in range(m) :
            if j - 1 in f :
                continue
            print(a[i][j], end = ' ')
        print()
