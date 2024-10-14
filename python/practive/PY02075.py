for _ in range(int(input())) :
    n = int(input())
    
    a = []
    
    for i in range(n) :
        a.append([int(x) for x in input().split()])
        
    a = sorted(a, key = lambda x : (x[1], x[0]))
    
    # for i in a :
    #     print(i[0], i[1])
    
    cnt, res = 1, a[0][1]
    for i in range(1, n) :
        if a[i][0] >= res :
            cnt += 1
            res = a[i][1]
    print(cnt)
        
