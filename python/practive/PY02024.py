from functools import cmp_to_key
def compare(a, b) :
    if sm(a) == sm(b) :
        if int(a) <= int(b) :
            return -1
        else :
            return 1
    elif sm(a) < sm(b) :
        return -1
    else :
        return 1

def sm(s) :
    res = 1
    for i in s :
        res *= int(i)
        
    return res

for i in range(int(input())) :
    n = int(input())
    
    a = list(input().split())
    
    a = sorted(a, key=cmp_to_key(compare))
    
    for i in a :
        print(i, end = ' ')
        
    print()