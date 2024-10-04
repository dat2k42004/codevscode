from math import *
def change(s) :
    x = s.strip().lower().split()
    s = ''
    for i in x :
        s += i[0].upper() + i[1 : ] + ' '
    return s.strip()
class score :
    def __init__ (self, t, x, a, b, c) :
        self.id = 'SV{:02d}'.format(t)
        self.name = change(x)
        self.average = (a * 3 + b * 3 + c * 2) / 8
        
    def __str__ (self) :
        return '{} {} {:.2f}'.format(self.id, self.name, ceil(self.average * 100) / 100)
    pass

def cmp(x) :
    return x.average

n = int(input())
a = []
for i in range(n) :
    a.append(score(i + 1, input(), int(input()), int(input()), int(input())))
    
a.sort(key = cmp, reverse = True)

x = 0.0
cnt = 0
for i in range(n) :
    if a[i].average != x :
        x = a[i].average
        cnt = i + 1
    print(a[i], cnt)

