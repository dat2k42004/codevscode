def check(s) :
    res = 0
    for i in range(len(s) - 1) :
        if abs(int(s[i]) - int(s[i + 1])) != 2 :
            print("NO")
            return
        res += int(s[i])
        
    res += int(s[len(s) - 1])
    
    if res % 10 == 0 :
        print("YES")
        return
    
    print("NO")

    
    
for i in range(int(input())) :
    n = input() 
    
    check(n)
    
    