from math import *
def prime (n) :
    if n < 2 :
        return False
    for i in range(2, isqrt(n) + 1) :
        if n % i == 0 :
            return False
    return True
n = int(input())

a = [int(x) for x in input().split()]

b = []
for i in a :
    if b.count(i) == 0 :
        b.append(i)
        
for i in range(1, len(b)) :
    b[i] += b[i - 1]
    
ok = False
for i in range(0, len(b)) :
    if prime(b[i]) and prime(b[len(b) - 1] - b[i]) :
        print(i)
        ok = True
        break

if not(ok) :
    print('NOT FOUND')