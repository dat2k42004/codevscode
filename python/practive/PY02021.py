for i in range(int(input())) :
    n, m, k = map(int, input().split())
    
    a = [int(x) for x in input().split()]
    b = [int(x) for x in input().split()]
    c = [int(x) for x in input().split()]
    ok = False
    for i in a :
        if b.count(i) > 0 and c.count(i) > 0 :
            print(i, end = ' ')
            ok = True
            b.remove(i)
            c.remove(i)
            
    if not(ok) :
        print('NO')
    else :
        print()
        
