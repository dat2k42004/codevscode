import math

def check(n) :
    if n < 2 : 
        return False
    for i in range(2, int(math.sqrt(n)) + 1) :
        if n % i == 0 :
            return False
    
    return True

def solve(s) :
    if check(len(s)) == False : 
        print('NO')
        return
    cnt = 0
    for i in s :
        if i == '2' or i == '3' or i == '5' or i == '7' :
            cnt += 1
            
    if(cnt <= len(s) - cnt) :
        print("NO")
        return
    
    print('YES')
    
    
for i in range(int(input())) :
    s = input()
    
    solve(s)
    