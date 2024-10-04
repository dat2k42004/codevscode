from math import *
def prime(n) :
    if n < 2 :
        return False
    for i in range(2, int(sqrt(n)) + 1) :
        if n % i == 0 :
            return False
        
    return True
            
def check(n) :
    if not(prime(int(n))) :
        print('No')
        return
    if not(prime(int(n[ :: -1]))) :
        print('No')
        return
    
    res = 0
    for i in n :
        if i != '2' and  i != '3' and i != '5' and i != '7' :
            print('No')
            return
        res += int(i)
        
    if not(prime(res)) :
        print('No')
        return
    print('Yes')

for i in range(int(input())) :
    check(input())