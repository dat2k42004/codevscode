for i in range(int(input())) :
    n = int(input()) 
    a = set(int(x) for x in input().split())
    l = min(a)
    r = max(a)
    
    print(r - l + 1 - len(a))
