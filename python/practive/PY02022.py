from math import *
def check(n) :
    if n < 2 :
        return False
    
    for i in range(2, int(sqrt(n)) + 1) :
        if n % i == 0 :
            return False
        
    return True

n = int(input())

a = [int(x) for x in input().split()]

f = [0] * 1000000

for i in a :
    if check(i) :
        f[i] += 1
    
for i in a :
    if f[i] > 0 :
        print(i, f[i])
        f[i] = 0