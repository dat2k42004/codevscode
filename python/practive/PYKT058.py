
def check(n, k, u, v, f) :
    s, vs = [u], [0] * (n + 1)
    vs[u] = 1
    while len(s) > 0 :
        x = s.pop()
        if x == v :
            return False
        else :
            for i in f[x] :
                if vs[i] == 0 and i != k :
                    vs[i] = 1
                    s.append(i)
    return True
    


for _ in range(int(input())) :
    n, m, u, v = [int(x) for x in input().split()]
    
    f = []
    for i in range(n + 1) :
        f.append([])
    
    for i in range(m) :
        x, y = [int(j) for j in input().split()]
        
        f[x].append(y)
    cnt = 0
    for i in range(1, n + 1) :
        if i != u and i != v :
            if check(n, i, u, v, f) :
                cnt += 1
    print(cnt)
        
    