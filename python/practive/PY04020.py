class bill :
    def __init__ (self, id, name, num, cost, discount) :
        self.id = id
        self.name = name
        self.num = num
        self.cost = cost
        self.discount = discount
        self.sum = cost * num - discount
        
    def __str__ (self) :
        return f'{self.id} {self.name} {self.num} {self.cost} {self.discount} {self.sum}'
    pass

def cmp(x) :
    return x.sum

n = int(input())

a = []

for i in range(n) :
    a.append(bill(input(), input(), int(input()), int(input()), int(input())))
    
a.sort(key = cmp, reverse = True)

print(*a, sep = '\n')
