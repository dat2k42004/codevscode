class candidate :
    def __init__ (self, t, name, x, y) :
        self.id = "TS0" + str(t)
        self.name = name
        if x > 10.0 :
            x = x / 10
        if y > 10.0 :
            y = y / 10
        
        self.score = round((x + y) / 2, 2)
        
        if self.score > 9.5 :
            self.status = "XUAT SAC"
        elif self.score >= 8.0 :
            self.status = "DAT"
        elif self.score >= 5.0 :
            self.status = "CAN NHAC"
        else :
            self.status = "TRUOT"
        
    def __str__(self) :
        return "{} {} {:.2f} {}".format(self.id, self.name, self.score, self.status)
    
def cmp(a) :
    return (-1) * a.score

a = []

for i in range(int(input())) :
    name = input()
    x = float(input())
    y = float(input())
    a.append(candidate(i + 1, name, x, y))

a.sort(key = cmp, reverse=False)

for x in a :
    print(x)
