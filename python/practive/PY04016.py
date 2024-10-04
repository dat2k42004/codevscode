import time
def distance_date(d1, d2) :
    d_format = "%d/%m/%Y"
    x = time.mktime(time.strptime(d1, d_format))
    y = time.mktime(time.strptime(d2, d_format))
    
    return int((y - x) / 86400) + 1

class bill :
    def __init__(self, t, name, room, checkin, checkout, extra) :
        self.id = "KH" + '{:02d}'.format(t)
        self.name = name
        self.room = room
        self.dayin = distance_date(checkin, checkout)
        self.cost = extra
        if room[0] == '1' :
            self.cost += 25 * self.dayin
        elif room[0] == '2' :
            self.cost += 34 * self.dayin
        elif room[0] == '3' :
            self.cost += 50 * self.dayin
        else :
            self.cost += 80 * self.dayin
        
    def __str__ (self) :
        return '{} {} {} {} {}'.format(self.id, self.name, self.room, self.dayin, self.cost)
    
def cmp(a) :
    return a.cost

a = [] 
for i in range(int(input())) :
    name = input()
    room = input()
    s = input().strip()
    e = input().strip()
    x = int(input())
    a.append(bill(i + 1, name, room, s, e, x))
    
a.sort(key = cmp, reverse = True)

for x in a :
    print(x)