f = [0] * 93

def init() :
    f[1] = 1
    for i in range(2, 93) :
        f[i] = f[i - 1] + f[i - 2]
        
init()

for i in range(int(input())) :
    a, b = map(int, input().split())
    
    for i in range(a, b + 1) :
        print(f[i], end = ' ')
    
    print()