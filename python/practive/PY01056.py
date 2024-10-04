from math import *
def check(n) :
    if n < 2 :
        return False
    for i in range(2, int(sqrt(n)) + 1) :
        if n % 2 == 0 :
            return False
        
    return True
for i in range(int(input())) :
    s = input()
    
    res = 0
    ok = True
    for i in range(len(s)) :
        if int(s[i]) & 1 and i% 2 == 0 :
            print('NO')
            ok = False
            break
        if int(s[i]) % 2 == 0 and i & 1 :
            print('NO')
            ok = False
            break
        
        res += int(s[i])
        
    if ok and check(res) :
        print('YES')
        
        