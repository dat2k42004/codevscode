def change(s) :
    res = s.lower().split()
    s = ''
    for i in res :
        s += i[0].upper() + i[1 : ] + ' '
    return s.strip()
    
class score :
    def __init__ (self, x, y, z, t, i) :
        self.id = 'TS{:02d}'.format(i)
        self.name = change(x)
        self.sum = y
        if z != 'Kinh' :
            self.sum += 1.5
        if t == 1 :
            self.sum += 1.5
        elif t == 2 :
            self.sum += 1.0
            
        if self.sum >= 20.5 :
            self.status = 'Do'
        else :
            self.status = 'Truot'
            
    def __str__ (self) :
        return '{} {} {:.1f} {}'.format(self.id, self.name, self.sum, self.status)
    pass
def cmp (x) :
    return (-1 * x.sum, x.id)
n = int(input())
a = []

for i in range(n) :
    a.append(score(input().strip(), float(input()), input(), int(input()), i + 1))
a.sort(key = cmp, reverse = False)

print(*a, sep = '\n')
