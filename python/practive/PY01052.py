import math

def check(n) :
    if n < 2 :
        return False
    for i in range(2, int(math.sqrt(n)) + 1) :
        if n % i == 0 :
            return False
        
    return True

def solve(n) :
    res = 0
    for i in n :
        res += int(i)
        
    if check(res) :
        print('YES')
        
    else :
        print('NO')
        
        
for i in range(int(input())) :
    n = input() 
    
    solve(n)
    
    