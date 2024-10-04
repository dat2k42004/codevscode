while True :
    s = input().strip()
    
    if s == '-1' :
        break
    
    l, r = map(int, s.split())
    
    n = int(input().strip())
    
    a = set()
    
    for i in range(2, n + 1) :
        for j in range(int(l / i) + 1 , int(r / i) + 1) :
            a.add(j * i)
        if l % i == 0 and l not in a :
            a.add(l)
    
<<<<<<< HEAD
    print(r - l + 1 - len(a))
=======
    print(r - l + 1 - len(a))
>>>>>>> 9abf98ba51183357e05cab54d9686df2ea0e2c67
