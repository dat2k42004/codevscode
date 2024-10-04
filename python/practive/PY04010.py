class candidate :
    def __init__ (self, name, birthday, d1, d2 , d3) :
        self.name = name
        self.birthday = birthday
        self.sum = d1 + d2 + d3
        
    def output(self) :
        print('{} {} {:.1f}'.format(self.name, self.birthday, self.sum))
        
name = input()
birthday = input()
d1 = float(input())
d2 = float(input())
d3 = float(input())

a = candidate(name, birthday, d1, d2, d3)
a.output()
