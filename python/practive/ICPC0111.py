for i in range(int(input())) :
    n, k = map(int, input().split())
    
    a = [int(x) for x in input().split()]
    
    k = k % n
    
    for i in range(k, n) :
        print(a[i], end = ' ')
    for i in range(k) :
        print(a[i], end = ' ')
    print()
    
    