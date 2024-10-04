for i in range(int(input())) :
    s = input()
    a = [int(x) for x in s]
    ok = False
    for i in range(len(a) - 1, 0, -1) :
        if a[i] < a[i - 1] :
            res = a[i]
            a[i] = a[i - 1]
            a[i - 1] = res
            ok = True
            break
    if ok and a[0] != 0 :
        for i in a :
            print(i, end = '')
        print()
    else :
        print(-1)
    

