s = input()
n = len(s)

vs = [0] * (n + 1)

v = [0] * (n + 1)

def next(i) :
    for j in range(1, n + 1) :
        if vs[j] == 0 :
            v[i] = j
            vs[j] = 1
            if i == n :
                for x in range(1, n + 1) :
                    print(s[v[x] - 1], end = '')
                    
                print()
            else :
                next(i + 1)
                
            vs[j] = 0
            
next(1)

