from math import *
class bill :
    def __init__(self, name, old, new, t) :
        self.name = name
        res = new - old
        if res > 100 :
            self.sum = round((50 * 100 + 50 * 150 + (res - 100) * 200 ) * 1.05, 1)
        elif res > 50 :
            self.sum = round((50 * 100 + (res - 50) * 150) * 1.03, 1)
        else :
            self.sum = round(res * 100 * 1.02, 1)
            
        self.id = "KH" + "{:02d}".format(t)
        
    def __str__(self) :
        return "{} {} {:.0f}".format(self.id, self.name, self.sum)

a = []
for i in range(int(input())) :
    name = input()
    x = int(input())
    y = int(input())
    a.append(bill(name, x, y, i + 1))

a.sort(key = lambda x : (-1) * x.sum)

for x in a :
    print(x)
    
