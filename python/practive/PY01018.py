p = 'ABCDEFGHIJKLMNOPQRSTUVWXYZ_.'


while 1 :
    a = input()
    
    if a == '0' :
        break
    
    k, s = a.split()
    
    k = int(k)
    n = ''
    
    for i in s :
        x = 0
        for j in p :
            if i == j :
                break
            x += 1
            
        x = (x + k) % 28
        n = p[x] + n
        
    print(n)
    
        
