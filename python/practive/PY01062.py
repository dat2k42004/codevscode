from math import *

def check(n) :
    if n < 2 :
        return False
    for i in range(2, int(sqrt(n)) + 1) :
        if n % i == 0 :
            return False
    return True

for i in range(int(input())) :
    s = input()
    ok = True
    cnt = 0
    if not(check(len(s))) :
        ok = False
    
    for i in s :
        if i == '2' or i == '3' or i == '5' or i == '7' :
            cnt += 1
            
    if ok and cnt > len(s) - cnt :
        print('YES')
    else :
        print('NO')
        
        
    