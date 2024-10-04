for i in range(int(input())) :
    n = int(input())
    
    a = [0] * 1001
    
    for i in range(n) :
        x = int(input())
        a[x] += 1
    res = 0
    cnt = 0
    for i in range(1, 1001) :
        if a[i] > cnt :
            res = i
            cnt = a[i]
            
    print(res)
    