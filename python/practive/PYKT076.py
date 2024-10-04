n, m = map(int, input().split())
a = []
b = []
class type_film :
    def __init__ (self, name, t) :
        self.name_type = name
        self.id_type = 'TL{:03d}'.format(t)
        
for i in range(n) :
    a.append(type_film(input(), i + 1))

class film :
    def __init__(self, t, id_type, start, name, num) :
        self.id = 'P{:03d}'.format(t) 
        self.start = start
        self.num = num
        self.name = name
        for i in a :
            if id_type == i.id_type :
                self.type = i.name_type
        
    def __str__ (self) :
        return f'{self.id} {self.type} {self.start} {self.name} {self.num}'
    pass
def cmp(x) :
    res = x.start[6 : ] + x.start[3 : 5] + x.start[0 : 3] 
    return (res, x.name, -1 * x.num)
for i in range(m) :
    b.append(film(i + 1, input(), input(), input(), int(input())))
    
b.sort(key = cmp, reverse = False)

print(*b, sep = '\n')

