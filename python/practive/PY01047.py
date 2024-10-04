import math

def check(n) :
    if n < 2 :
        return False
    
    for i in range(2, int(math.sqrt(n)) + 1) :
        if n % i == 0 :
            return False
    
    return True

for i in range(int(input())) :
    s = input()
    
    if check(int(s[-4 : ])) :
        print("YES")
        
    else :
        print('NO')