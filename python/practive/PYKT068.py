class subject :
    def __init__ (self, x, y, z) :
        self.id = x
        self.name = y
        self.perform = z 
    
    def __str__(self) :
        return self.id + ' ' + self.name + ' ' + self.perform
    
    pass

def cmp(x) :
    return x.id

a = []

for i in range(int(input())) :
    a.append(subject(input(), input(), input()))

a.sort(key = cmp, reverse = False)

print(*a, sep = '\n')

