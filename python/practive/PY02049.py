for i in range(int(input())) :
    n, k = map(int, input().split())
    
    res = int(n / k) 
    cnt = res
    while res >= k :
        res = int(res / k)
        cnt += res
    print(cnt)
    
