g = [1, 4, 9, 16] 
a = [10, 12, 14, 20]
b = [10, 11, 13, 16]
c = [9, 10, 12, 14]
d = [8, 9, 11, 13]
n = int(input())
l1 = []
class position :
    def __init__ (self, id_pos, name_pos) :
        self.id_pos = id_pos
        self.name_pos = name_pos
    
for i in range(n) :
    s = input().split()
    l1.append(position(s[0], ' '.join(s[1 : ])))

m = int(input())
l2 = []

class staff :
    def __init__ (self, id, name, base, unit) :
        self.id = id
        self.name = name
        for i in range(n) :
            if id[3 : ] == l1[i].id_pos :
                self.pos = l1[i].name_pos
                break
        self.sum = base * unit * 1000
        
        if id[0] == 'A' :
            for i in range(3, -1, -1) :
                if int(id[1 : 3]) >= g[i] :
                    self.sum *= a[i]
                    break
        elif id[0] == 'B' :
            for i in range(3, -1, -1) :
                if int(id[1 : 3]) >= g[i] :
                    self.sum *= b[i]
                    break
        elif id[0] == 'C' :
            for i in range(3, -1, -1) :
                if int(id[1 : 3]) >= g[i] :
                    self.sum *= c[i]
                    break
        else :
            for i in range(3, -1, -1) :
                if int(id[1 : 3]) >= g[i] :
                    self.sum *= d[i]
                    break
    def __str__ (self) :
        return f'{self.id} {self.name} {self.pos} {self.sum}'   
    pass

for i in range(m) :
    l2.append(staff(input(), input(), int(input()), int(input())))

print(*l2, sep = '\n')
