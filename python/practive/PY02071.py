def next(i, sum, l, a, n) :
    if sum == n :
        a.append(l)
    elif sum < n :
        for j in range(i, 0, -1) :
            next(j, sum + j, l + str(j) + ' ', a, n)
            
        
for i in range(int(input())) :
    n = int(input())
    a = []
    next(n, 0, '', a, n)
    print(len(a))
    for i in range(len(a)) :
        print('(' + a[i].strip( ) + ')', end = ' ')
    print()
    
        