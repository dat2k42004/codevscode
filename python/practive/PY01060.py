for i in range(int(input())) :
    s = input()
    
    add = 0
    mul = 1
    
    for i in range(0, len(s), 2) :
        if s[i] != '0' :
            mul *= int(s[i])
            
    for i in range(1, len(s), 2) :
        add += int(s[i])
        
    print(mul, add)
    
    