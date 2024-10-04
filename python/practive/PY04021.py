class time :
    def __init__(self, id, name, s, e) :
        self.id = id
        self.name = name
        a = int(e[0 : 2]) - int(s[0 : 2])
        b = int(e[3 : ]) - int(s[3 : ])
        if b < 0 :
            a -= 1
            b = 60 + b
        self.t = a * 60 + b
        self.res = "{} gio {} phut".format(a, b)
        
    def __str__(self) :
        return self.id +  " " + self.name + " " + self.res

def cmp(a) :
    return (-1) * a.t

a = []
for i in range(int(input())) :
    id = input()
    name = input()
    x = input()
    y = input()
    a.append(time(id, name, x, y))
    
a.sort(key = cmp, reverse = False)

for x in a :
    print(x)
    
