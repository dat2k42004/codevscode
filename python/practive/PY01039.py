for i in range(int(input())) :
    s = input()
    
    x = s[0] 
    y = s[1]
    
    ok = True
    
    for i in range(2, len(s), 2) :
        if s[i] != x :
            ok = False
            break
        
    for i in range(3, len(s), 2) :
        if s[i] != y :
            ok = False
            break
        
    print("YES" if ok else "NO")
    