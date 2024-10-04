t = int(input())

for i in range(t) :
    n, k = map(int, input().split())
    
    a = [int(x) for x in input().split()]
    
    res = a[0]
    for j in a :
        res = max(res, j)
    for j in range(n) :
        if a[j] == res :
            a.insert(j, k)
            break
    for j in a :
        if j < 0 :
            print(j, end = ' ')
    for j in a :
        if j >= 0 :
            print(j, end = ' ')
    print()
    
    
