def check(s) :
    for i in range(len(s) - 1) :
        if s[i] > s[i + 1] :
            return 0
        
    return 1


for i in range(int(input())) :
    s = input()
    
    if check(s) :
        print('YES')
        
    else :
        print('NO')
        