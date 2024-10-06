for i in range(int(input())) :
    s = input()
    
    x = 1
    y = 1
    a = []
    res = []
    for j in s :
        if j == '(' :
            a.append(x)
            y = x
            x += 1
        elif j == ')' :
            while y in res :
                y -= 1
            a.append(y)
            res.append(y)
            y -= 1
    print(*a)

    

