class score :
    def __init__(self, t, name, x, d1, d2) :
        self.id = 'GV{:02d}'.format(t)
        self.name = name
        if x[0] == 'A' :
            self.subject = 'TOAN'
        elif x[0] == 'B' :
            self.subject = 'LY'
        elif x[0] == 'C' :
            self.subject = 'HOA'
            
        self.sum = d1 * 2.0 + d2
        
        if x[1] == '1' :
            self.sum += 2.0
        elif x[1] == '2' :
            self.sum += 1.5
        elif x[1] == '3' :
            self.sum += 1.0
            
        if self.sum >= 18.0 :
            self.status = 'TRUNG TUYEN'
        else :
            self.status = 'LOAI'
            
    def __str__(self) :
        return "{} {} {} {:.1f} {}".format(self.id, self.name, self.subject, self.sum, self.status)
            
    
def cmp(a) :
    return a.sum

l = [] 
for i in range(int(input())) :
    l.append(score(i + 1, input(), input(), float(input()), float(input())))
    
l.sort(key = cmp, reverse = True)

print(*l, sep = '\n')
    


