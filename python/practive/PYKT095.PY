def change(s) :
    res = s.strip().lower().split()
    s = ''
    for i in res :
        s += i[0].upper() + i[1 : ] + ' '
    return s.strip()


class electric :
    def __init__(self, name, s, t) :
        self.name = change(name)
        self.id = 'KH{:02d}'.format(t)
        x = s.split()
        res = int(x[2]) - int(x[1])
        self.in_range = 0
        self.out_range = 0
        self.vat = 0
        if x[0] == 'A' :
            if res > 100 :
                self.in_range = 100 * 450
                self.out_range = (res - 100) * 1000
                self.vat = self.out_range // 20
            else :
                self.in_range = res * 450
                self.out_range = 0
                self.vat = 0
        elif x[0] == 'B' :
            if res > 500 :
                self.in_range = 500 * 450
                self.out_range = (res - 500) * 1000
                self.vat = self.out_range // 20
            else :
                self.in_range = res * 450
                self.out_range = 0
                self.vat = 0
        else :
            if res > 200 :
                self.in_range = 200 * 450
                self.out_range = (res - 200) * 1000
                self.vat = self.out_range // 20
            else :
                self.in_range = res * 450
                self.out_range = 0
                self.vat = 0
        self.sum = self.in_range + self.out_range + self.vat
        
    def __str__ (self) :
        return f'{self.id} {self.name} {self.in_range} {self.out_range} {self.vat} {self.sum}'

def cmp(a) :
    return a.sum

n = int(input())
l = []
for i in range(n) :
    l.append(electric(input(), input(), i + 1))
l.sort(key = cmp, reverse = True)

print(*l, sep = '\n')
