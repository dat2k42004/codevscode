def krish(n) :
    res = 1
    for i in range(1, n + 1) :
        res *= i
        
    return res

def check(s) :
    res = 0
    for i in s :
        res += krish(int(i))
        
    if res == int(s) :
        print('Yes')
    else :
        print('No')
        
        
for i in range(int(input())) :
    check(input())
    
     