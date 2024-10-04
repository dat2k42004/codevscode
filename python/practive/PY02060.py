import math
def factory(a, b) :
    res = 1
    for i in range(a, b + 1) :
        res *= i
    return res

def calcu(n) :
    cnt1 = 1
    cnt2 = 0
    i = 2
    while i <= math.isqrt(n) :
        if n % i == 0 :
            x = 0
            while n % i == 0 :
                x += 1
                n = int(n / i)
            cnt1 *= (x + 1)
            cnt2 += 1
        i += 1
    if n > 1 :
        cnt1 *= 2
        cnt2 += 1
    res = (cnt1 - 1) * 2 + 1
    if cnt2 > 1 :
        for i in range(1, int(cnt2 / 2) + 1) :
            if i > 1 :
                res += math.comb(cnt2, i) * 2
            else :
                res += math.comb(cnt2, i)
    print(res % (1000000007))        
    
    
            

for i in range(int(input())) :
    a, b = map(int, input().split())
    
    res = factory(a, b)
    calcu(res)