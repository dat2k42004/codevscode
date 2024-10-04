for i in range(int(input())) :
    s = input()
    
    i = 0
    while i < len(s) :
        j = i + 1
        while j < len(s) and s[j] == s[i] :
            j += 1
        print(j - i, s[i], sep = '', end = '')
        
        i = j 
    
    print()
    