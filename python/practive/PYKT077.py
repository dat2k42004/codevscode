n, m = map(int, input().split())
a = []
b = []

class subject :
    def __init__(self, id, name) :
        self.id = id
        self.name = name
    pass
for i in range(n) :
    a.append(subject(input(), input()))
    
class test :
    def __init__ (self, i, s) :
        self.id = 'T{:03d}'.format(i)
        x = s.split()
        self.id_sub = x[0]
        self.day = x[1]
        self.time = x[2]
        self.group = x[3]
        for i in a :
            if x[0] == i.id :
                self.sub = i.name
    def __str__ (self) :
        return f'{self.id} {self.id_sub} {self.sub} {self.day} {self.time} {self.group}'
    pass

def cmp(x) :
    res = x.day[6 : ] + x.day[3 : 5] + x.day[0 : 2]
    return (res, x.time, x.id_sub)

for i in range(m) :
    b.append(test(i + 1, input()))
    
b.sort(key = cmp, reverse = False)

print(*b, sep = '\n')
