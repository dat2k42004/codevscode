for i in range(int(input())) :
    n, m = map(int, input().split())
    
    a = []
    b = []
    
    for i in range(n) :
        l = [int(x) for x in input().split()]
        a.append(l)
        
    for i in range(3) :
        l = [int(x) for x in input().split()]
        b.append(l)
    res = 0   
    for i in range(n - 2) :
        for j in range(m - 2) :
           for h in range(3) :
               for k in range(3) :
                    res += b[h][k] * a[h + i][k + j]
    
    print(res)
    