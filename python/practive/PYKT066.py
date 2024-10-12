import math
for i in range(int(input())) :
    n, k = map(int, input().split())
    a = []
    while True :
        l = [int(x) for x in input().split()]
        a += l
        if len(a) == n  :
            break
    
    ok = False
    cnt = n
    for i in range(n) :
        current = a[i]
        
        if current == k :
            ok = True
            cnt = min(cnt, 1)
            break
        for j in range(i + 1, n) :
            current = math.gcd(current, a[j])
            
            if current == k :
                cnt = min(cnt, j - i + 1)
                ok = True
            elif current < k :
                break
    if ok :
        print(cnt) 
    else :
        print(-1)

 
            