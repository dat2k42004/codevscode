import math
def solve(n):
    res = '1'
    
    for i in range(2, int(math.sqrt(n)) + 1) :
        if n % i == 0 :
            cnt = 0
            while n % i == 0 :
                cnt += 1
                n /= i
                
            res += ' * ' + str(i) + '^' + str(cnt)
            
    if n > 1 :
        res += ' * ' + str(int(n)) + '^' + '1'
        
    print(res)
    
    
for i in range(int(input())) :
    n = int(input())
    
    solve(n)
    
    
        