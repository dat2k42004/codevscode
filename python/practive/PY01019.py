for i in range(int(input())) :
    s = input()
    
    l = 0
    r = len(s) - 1
    ok = 1
    while l < r :
        if abs(ord(s[l]) - ord(s[l + 1])) != abs(ord(s[r]) - ord(s[r - 1])) :
            ok = 0
            break
        l += 1
        r -= 1
        
    if ok :
        print("YES")
        
    else :
        print("NO")
        