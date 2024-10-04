import math
def prime(n) :
    if n < 2 :
        return False
    for i in range(2, math.isqrt(n) + 1) :
        if n % i == 0 :
            return False
    
    return True


def check(n) :
    for i in range(2, math.isqrt(n) + 1) :
        if n % i == 0 and i * i != n and prime(i) and prime(int(n / i)) :
            return True
        
    return False

n = int(input())

res = 0
for i in range(1, math.isqrt(n) + 1) :
    if check(i) or (math.isqrt(math.isqrt(i)) ** 4 == i and prime(math.isqrt(math.isqrt(i)))) :
        res += 1        
print(res)