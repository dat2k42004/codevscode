n = int(input())
a = []
for i in range(n) :
    a.append(input())
    
s = a[0] + a[0]
m = len(a[0])
f = []
ok = True
for i in range(n) :
    if len(a[i]) != m :
        print(-1) 
        ok = False
        break
    t = -1
    for j in range(0, m) :
        if a[i] == s[j : (j + m)] :
            t = j
            break
    if t == -1 :
        print(-1)
        ok = False
        break
    else :
        f.append(t)    
 
if ok :
    cnt = m * n
    for i in range(m) :
        res = 0
        for j in range(n) :
            res += (i - f[j] + m) % m
        cnt = min(res, cnt)
        
    print(cnt)
    
