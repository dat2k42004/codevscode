class Rectangle :
    def __init__ (self, height, weith, color) :
        self.height = height
        self.weith = weith
        self.color = color
        
    def perimeter(self) :
        return 2 * (self.height + self.weith)
    
    def area(self) :
        return self.height * self.weith
    
    def color(self) :
        return self.color[0].upper() + self.color[1 : ].lower()
    

arr = input().split()
if int(arr[0]) > 0 and int(arr[1]) > 0 :
    r = Rectangle(int(arr[0]), int(arr[1]), str(arr[2]))
    print('{} {} {}'.format(r.perimeter(), r.area(), r.color()))
else :
    print("INVALID")