f = [1] * 1000001

def init() :
    f[0] == f[1] == 0
    
    for i in range(2, 1001) :
        for j in range(i * i, 1000001, i) :
            f[j] = 0
   
def change (n) :
    s = str(n) 
    s = s[ :: -1]
    return int(s)         
init()

for i in range(int(input())) :
    n = int(input()) 
    a = [0] * (n + 1)
    for i in range(13, n) :
        j = change(i)
        if a[i] == 0 and f[i] == 1 and j < n and f[j] == 1 and i != j :
            print(i, j, end = ' ')
            a[i] = 1
            a[j] = 1
    print()

    
    
    