for i in range(int(input())) :
    n = int(input())
    
    l = list(map(int, input().split()))
    
    res = 0
    for i in range(3) :
        res += min(l)
        l.remove(min(l))
    
    print(res)
    