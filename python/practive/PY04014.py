class Student:
    def __init__(self, idx, Name, p):
        self.id = "HS" + "{:02d}".format(idx)
        self.Name = Name
        self.score = p[0] * 2.0 + p[1] * 2.0
        for i in range(2, 10):
            self.score += p[i]
        self.score = round(self.score / 10 / 1.2, 1)
        if self.score >= 9.0:
            self.status = "XUAT SAC"
        elif self.score >= 8.0:
            self.status = "GIOI"
        elif self.score >= 7.0:
            self.status = "KHA"
        elif self.score >= 5.0:
            self.status = "TB"
        else:
            self.status = "YEU"
    def output(self):
        return "{} {} {:.1f} {}".format(self.id, self.Name, self.score, self.status)

def cmp(a):
    return (a.score, (-1) * a.id)

List = []

for i in range(int(input())):
    List.append(Student(i + 1, input(), list(map(float, input().split()))))

List.sort(key=cmp, reverse=True)

for i in List:
    print(i.output())
    
