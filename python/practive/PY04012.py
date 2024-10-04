class deligence :
    def __init__(self, id, name, clas) :
        self.id = id
        self.name = name
        self.clas = clas

        self.score = 10
        
    def __str__ (self) :
        return "{} {} {} {}".format(self.id, self.name, self.clas, self.score)

def calcu(s) :
    res = 10
    for i in s :
        if i == 'm' :
            res -= 1
        elif i == 'v' :
            res -= 2
        if res <= 0 :
            return 0
    return res    
a = [] 
n = int(input())

for i in range(n) :
    id = input()
    name = input()
    clas = input()
    a.append(deligence(id, name, clas))
    
for i in range(n) :
    x, y = map(str, input().split())
    
    res = calcu(y)
    
    for i in a :
        if i.id == x :
            i.score = res
    
for i in a :
    print(i, end = ' ')
    if i.score == 0 :
        print("KDDK")
    else :
        print()
    
    