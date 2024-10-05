f = open('VANBAN.in', 'r')

d = {}
res = 0

for x in f :
    a = x.split()
    
    for i in a :
        if i == i[ :: -1] :
            if len(i) > res :
                res = len(i)
                d.clear()
                d[i] = 1
            elif len(i) == res :
                if i not in d :
                    d[i] = 1
                else :
                    d[i] += 1

for i in d :
    print(i, d[i])
    