f = [0] * (10 ** 18 + 1)
l = []
def init () :
    for i in range(2, 10 ** 9 + 1) :
        if f[i] == 0 :
            for j in range(i * i, 10 ** 18 + 1, i):
                f[j] = i
    l.append(1)
    for i in range(2, 10 ** 18 + 1) :
        if f[i] == 0 :
            f[i] = i
        if f[i] <= 5 :
            l.append(i)


init()

for i in range(int(input())) :
    n = int(input()) 
    if f[n] <= 5 :
        print(l.index(n) + 1)
        
    else :
        print('Not in sequence')
        
