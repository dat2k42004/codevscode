def gcd (a, b) :
    if b == 0 :
        return a
    else :
        return gcd(b, a % b)
    
    
for i in range(int(input())) :
    s = input()
    
    a = int(s)
    b = int(s[ :: -1])
    
    if gcd(a, b) == 1 :
        print("YES")
        
    else :
        print("NO")
        
        