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
    for i in range(len(s)) :
        if check(i) and not(check(int(s[i]))) :
            print('NO')
            ok = False
            break
        if check(int(s[i])) and not(check(i)) :
            print('NO')
            ok = False
            break
        
    if ok :
        print('YES')
        
           