def check(s) :
    if len(s) <= 1 :
        return False
    
    if s == s[ :: -1] :
        return True
    
    return False

def solve(n) :                  
    res = 0
    for i in n :
        res += int(i) 
        
    if check(str(res)) :
        print('YES')
        
    else :
        print('NO')
        
        
for i in range(int(input())) :
    n = input()
    
    solve(n)
    
    