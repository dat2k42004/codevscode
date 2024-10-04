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

for i in range(int(input())) :
    n, m = map(int, input().split())
    a = []
    for i in range(n) :
        l = [int(x) for x in input().split()]
        a.append(l)
        
    res = matrix(n, m, a)
    res.solve()
    
