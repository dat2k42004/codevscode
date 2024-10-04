def check(a) :
    if len(a) < 4 :
        return False
    
    for i in a :
        if i.isdigit() :
            if int(i) < 0 or int(i) > 255 :
                return False
        else :
            return False
        
    return True

t = int(input()) 
for i in range(t) :
    a = input().split('.')
    if check(a) :
        print('YES')
    else :
        print('NO')