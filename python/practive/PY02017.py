for i in range(int(input())) :
    n = int(input())
    
    a = [int(x) for x in input().split()]
    s = set(a)
    
    for i in s :
        if a.count(i) % 2 == 1 :
            print(i)
            break
        
