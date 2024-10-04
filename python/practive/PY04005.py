from math import *
class point :
    def __init__(self, a, b) :
        self.a = a
        self.b = b
    
    def distance(self, x) :
        x1 = self.a - x.a
        y1 = self.b - x.b
        return sqrt(x1 * x1 + y1 * y1)
    
    
    
class triangle :
    def __init__(self, x, y, z) :
        self.x = x
        self.y = y
        self.z = z
    
    def output(self) :
        x1 = self.x.distance(self.y)
        x2 = self.x.distance(self.z)
        x3 = self.y.distance(self.z)
        
        if x1 + x2 > x3 and x1 + x3 > x2 and x2 + x3 > x1 :
            print('{:.3f}'.format(x1 + x2 + x3))
        else :
            print("INVALID")
            
    pass
n = int(input())
a = []
for i in range(n) :
    l = [float(x) for x in input().split()]
    a += l
i = 0   
for idc in range(n) :
    res = triangle(point(a[i], a[i + 1]), point(a[i + 2], a[i + 3]), point(a[i + 4], a[i + 5]))
    res.output()
    i += 6


