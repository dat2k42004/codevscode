s = 'ABCDEFGHIJKLMNOPQRSTUVWXYZ'
def change(x) :
    res = 0
    for i in x :
        res += s.index(i)
    r = ''
    for i in x :
        r += s[(s.index(i) + res) % 26]
    return r
for i in range(int(input())) :
    s1 = input().strip()
    n = int(len(s1) / 2)
    x = change(s1[0 : n])
    y = change(s1[n : ])
    
    r = ''
    for i in range(n) :
        r += s[(s.index(x[i]) + s.index(y[i])) % 26]
    
    print(r)
    
