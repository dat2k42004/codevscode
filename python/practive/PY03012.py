class student :
    def __init__(self, name, sum, submit) :
        self.name = name
        self.sum = sum
        self.submit = submit
    def get(self) :
        print(self.name, self.sum, self.submit)
    pass

a = []

for i in range(int(input())) :
    x = input()
    y, z = map(int, input().split())
    a.append(student(x, y, z))
    
a.sort(key = lambda x : ((-1) * x.sum, x.submit, x.name))

for i in a :
    i.get()


