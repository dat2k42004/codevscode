from math import *
def prime(n) :
    if n < 2 :
        return False
    for i in range(2, isqrt(n) + 1) :
        if n % i == 0 :
            return False
    return True
def cmp(x) :
    return x
n = int(input())

a = [int(x) for x in input().split()]

f = [] 
for i in a :
    if prime(i) :
        f.append(i)
        
f.sort(key = cmp, reverse = False)
j = 0
for i in a :
    if prime(i) :
        print(f[j], end = ' ')
        j += 1
    else :
        print(i, end = ' ')
        
