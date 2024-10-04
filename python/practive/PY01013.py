import math
def gcd(a, b):
    if b == 0 :
        return a
    else :
        return gcd(b, a % b)
    
    
def check(n) :
    if n < 2 : 
        return 0
    for i in range(2, int(math.sqrt(n)) + 1) :
        if n % i == 0 :
            return 0
        
    return 1

for i in range(int(input())) :
    a, b = map(int, input().split())
    
    res = gcd(a, b)
    s = str(res)
    res = 0
    for i in s :
        res += int(i)
        
    if check(res) :
        print("YES")
        
    else :
        print("NO")