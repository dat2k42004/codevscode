from math import *
f = [0] * 10001

l = [] 

def init() :
    for i in range(1, 10001) :
        f[i] = 1 
    
    f[1] = 0
    
    for i in range(2, int(sqrt(10000)) + 1) :
        for j in range(i * i, 10001, i) :
            f[j] = 0
    l.append(0)       
    for i in range(2, 10001) :
        if f[i] == 1 :
            l.append(i)
            
init()

n, k = map(int, input().split())

for i in range(n + 1) :
    k += l[i]
    print(k, end = ' ')
    