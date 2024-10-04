for i in range(int(input())) :
    n = int(input()) 
    
    a = list(map(int, input().split()))
    
    a = sorted(a)
    
    res = -1
    i = 0
    while i < n :
        j = i + 1
        while j < n and a[j] == a[i] :
            j += 1
        if j - i > n / 2 :
            res = a[i]
            break
        i = j
    if res == -1 :
        print('NO')
    else :
        print(res)