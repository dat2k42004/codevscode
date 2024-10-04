class matrix :
    def __init__(self, n, m, a) :
        self.n = n
        self.m = m
        self.a = a
        
    def solve(self) :
        for i in range(self.n) :
            for j in range(self.n) :
                res = 0
                for k in range (self.m) :
                    res += self.a[i][k] * self.a[j][k]
                
                print(res, end = ' ')
            
            print()
            
    pass
t = int(input())
a = []
while True :
    try :
        a.extend(map(int, input().split()))
    except :
        break
index = 0
for i in range(t) :
    n, m = a[index], a[index + 1]
    index += 2
    b = []
    for idx in range(n) :
        b.append([0] * m)
    while len(a) - index < n * m : a.append(0)
    for idx in range(n) :
        for j in range(m) :
            b[idx][j] = a[index + j]
        index += m
    res = matrix(n, m, b)
    res.solve()
    
