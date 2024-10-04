from math import *
f = [1] * 1000001

def init() :
    f[0] = f[1] = 0
    for i in range(2, 1001) :
        for j in range(i * i, 1000001, i) :
            f[j] = 0
            
init()    
for i in range(int(input())) :
    n = int(input())
    cnt = 0
    for i in range(5, n - 5) :
        if f[i] == 1 and f[i + 6] == 1 and (f[i + 2] == 1 or f[i + 4] == 1) :
            cnt += 1
            
    print(cnt)
