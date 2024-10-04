class complex :
    def __init__ (self, real, virtual) :
        self.real = real
        self.virtual = virtual
    def output(self, a) :
        x = self.real + a.real
        y = self.virtual + a.virtual
        
        x1 = self.real * x - self.virtual * y
        x2 = self.real * y + self.virtual * x
        
        y1 = x * x - y * y
        y2 = x * y + x * y
        
        print(x1, end = ' ')
        if x2 > 0 :
            print('+ ', x2, 'i,', sep = '', end = ' ')
        else :
            print('- ', abs(x2), 'i,', sep = '', end = ' ')
        print(y1, end = ' ')
        if y2 > 0 :
            print('+ ', y2, 'i', sep = '')
        else :
            print('- ', abs(y2), 'i', sep = '')
        
    
    pass

for i in range(int(input())) :
    a, b, c, d = map(int, input().split())
    
    A = complex(a, b)
    B = complex(c, d)
    A.output(B)


    