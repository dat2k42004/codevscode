from math import *
class fraction :
    def __init__ (self, numarator,demoninator) :
        self.numarator = numarator
        self.demoninator = demoninator 
        
    def instance(self) :
        x = gcd(self.numarator, self.demoninator)
        print('{}/{}'.format(int(self.numarator / x), int(self.demoninator / x)))
        
    pass
a, b = map(int, input().split())
A = fraction(a, b)
A.instance()