

def solve(s) :
    res = 0
    for i in s :
        res += int(i)
        
    if res % 3 == 0 :
        print('YES')
        
    else :
        print('NO')
        
for i in range(int(input())) :
    s = input()
    
    solve(s)
    
    