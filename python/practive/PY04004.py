from math import *

class fractor :
    def __init__(self, numerator, demoninator) :
        self.numerator = numerator
        self.demoninator = demoninator
    def instance(self, a) :
        x1 = self.numerator * a.demoninator + self.demoninator * a.numerator
        y1 = self.demoninator * a.demoninator
        x = gcd(x1, y1)
        print('{}/{}'.format(int(x1 / x), int(y1 / x)))
    pass
a = input().split()

A = fractor(int(a[0]), int(a[1]))
B = fractor(int(a[2]), int(a[3]))
A.instance(B)
