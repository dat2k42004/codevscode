m = {1 : 1}

while True :
    a = []
    ok = False
    
    for i in m :
        if i < 10 ** 18 :
            if i * 2 not in m :
                a.append(i * 2)
            if i * 3 not in m :
                a.append(i * 3)
            if i * 5 not in m :
                a.append(i * 5)
    for i in a :
        ok = True
        m[i] = 1
    if not(ok) :
        break

res = 1
a = sorted(m.keys())

for i in a :
    m[i] = res 
    res += 1


for i in range(int(input())) :
    n = int(input()) 
    if n in m:
        print(m[n])
        
    else :
        print('Not in sequence')
        
