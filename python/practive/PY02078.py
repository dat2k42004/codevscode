for _ in range(int(input())) :
    n = int(input())
    a, b = [], []
    f = [1] * n
    
    res = 0
    
    for i in range(n) :
        x, y = [float(j) for j in input().split()]
        a.append(x)
        b.append(y)
        
    for i in range(n) :
        for j in range(0, i) :
            if a[i] > a[j] and b[i] < b[j] :
                f[i] = max(f[i], f[j] + 1)
        res = max(res, f[i])
    print(res)
    
    