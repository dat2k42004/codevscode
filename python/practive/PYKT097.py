a = []
tmp = '.?!'
while True :
    try :
        s = input()
    
        res = s.lower().split()
        
        if len(res[-1]) == 1 and res[-1] in tmp :
            res[-2] += res[-1] 
            res.remove(res[-1])
        else :
            if res[-1][-1] not in tmp :
                res[-1] += '.'
        
        res[0] = res[0][0].upper() + res[0][1 : ]
        
        a.append(' '.join(res))
    except EOFError :
        break
    
print(*a, sep = '\n')
    