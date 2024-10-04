for i in range(int(input())) :
    s = input()
    
    if len(s) < 2 :
        print(s)
        continue
        
    l = [int(x) for x in s]
    
    for i in range(len(l) - 1, 0, -1) :
        if l[i] >= 5 :
            l[i] = 0
            l[i - 1] += 1
        else :
            l[i] = 0
    
    for i in l :
        print(i, end = '')
    print()
    