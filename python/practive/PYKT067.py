import math

def next(n, i, vs, a) :
    for j in range(n, 0, -1) :
        if vs[j] == 0 :
            vs[j] = 1
            a[i] = j
            if i == n :
                for k in range(1, n + 1) :
                    print(a[k], end = '')
                print(end = ' ')
            else :
                next(n, i + 1, vs, a)
            vs[j] = 0
            
for i in range(int(input())) :
    n = int(input()) 
    print(math.factorial(n))
    
    vs = [0] * (n + 1)
    a = [0] * (n + 1)
    
    next(n, 1, vs, a)
    print()
    
    
    
    