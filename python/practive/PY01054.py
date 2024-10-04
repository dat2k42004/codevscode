for i in range(int(input())) :
    n = input()
    
    res = 1
    
    for i in n :
        res *= int(i) if i != '0' else 1
        
    print(res)
    
    