for i in range(int(input())) :
    s = input()
    
    add = 0
    mul = 1
    
    for i in range(0, len(s), 2) :
        add += int(s[i])
    ok = False    
    for i in range(1, len(s), 2) :
        if s[i] != '0':
            ok = True
            mul *= int(s[i])
            
    print(add, mul if ok else 0)
    