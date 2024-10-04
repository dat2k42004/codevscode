def gcd(a, b) :
    if b == 0 :
        return a
    else :
        return gcd(b, a % b)
for i in range(int(input())) :
    n, k = map(int, input().split())
    a = []
    while True :
        l = [int(x) for x in input().split()]
        a += l
        if len(a) == n  :
            break
    
    if k in a :
        print(1)
    else :
        ok = False
        for i in range(n - 1) :
            if gcd(a[i], a[i + 1]) == k :
                ok = True
                break
            
        if ok :
            print(2)
        else :
            print(-1)
            
            