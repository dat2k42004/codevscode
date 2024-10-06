a = []
f = open('DATA.in', 'r')

for x in f :
    res = x.split()
    for i in res :
        if not i.isdigit() :
            a.append(i)
        elif abs(int(i)) > 2 ** 31 - 1 :
            a.append(i)
            
a = sorted(a)

print(*a)
            
