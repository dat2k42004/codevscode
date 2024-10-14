def bfs(n, u, f) :
    s = [u]
    vs = [0] * (n + 1)
    vs[u] = 1
    while len(s) :
        x = s[0]
        s.remove(x)
        for v in f[x] :
            if vs[v] == 0 :
                vs[v] = 1
                s.append(v)
    return [i for i in range(1, n + 1) if vs[i] == 0]
    
n, m, u = [int(x) for x in input().split()]

f = []
for i in range(n + 1) :
    f.append([])
    
for i in range(m) :
    x, y = [int(x) for x in input().split()]
    
    f[x].append(y)
    f[y].append(x)
    
a = bfs(n, u, f)
print(*a, sep = '\n')

