t = int(input())

for i in range(t):
    a, b = input().split()
    if a > b : 
        tmp = a
        a = b
        b = tmp
    
    x1 = input()
    x2 = input()
    
    s1 = x1
    s2 = x2
    
    for i in range(len(s1)):
        if s1[i] == b:
            s1[i] = a
    for i in range(len(s2)):
        if s2[i] == b:
            s2[i] = a
            
    print(int(s1) + int(s2), end = " ")
    
    for i in range(len(x1)):
        if s1[i] == a:
            s1[i] = b
    for i in range(len(x2)):
        if s2[i] == a:
            s2[i] = b
    
    
    print(int(x1) + int(x2), end = "\n")
    

    
    