n = int(input())
l1 = []

class team :
    def __init__(self, x, y, t):
        self.name_team = x
        self.school = y
        self.id_team = 'Team{:02d}'.format(t)

for i in range(n) :
    l1.append(team(input(), input(), i + 1))

m = int(input())
l2 = []

class candidate :
    def __init__(self, x, y, t):
        self.id = 'C{:03d}'.format(t)
        self.name = x
        self.id_team = y
        for i in range(n) :
            if self.id_team == l1[i].id_team:
                self.name_team = l1[i].name_team
                self.school = l1[i].school

    def __str__(self):
        return f'{self.id} {self.name} {self.name_team} {self.school}'

def cmp(x) :
    return x.name

for i in range(m) :
    l2.append(candidate(input(), input(), i + 1))

l2.sort(key = cmp, reverse = False)

print(*l2, sep = '\n')
