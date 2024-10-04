from math import *
def prime(n) :
    if n < 2 :
        return False
    for i in range(2, isqrt(n) + 1) :
        if n % i == 0 :
            return False
    return True
n, m = map(int, input().split())

a = []
res = 0
for i in range(n) :
    l = [int(x) for x in input().split()]
    for j in l :
        if prime(j) and j > res :
            res = j
    a.append(l)
if res != 0 :
    print(res)
    for i in range(n) :
        for j in range(m) :
            if a[i][j] == res :
                print('Vi tri [{}][{}]'.format(i, j)) 
else :
    print('NOT FOUND')
