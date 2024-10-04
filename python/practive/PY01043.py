def check(n) :
    for i in n :
        if (int(i) % 2 == 1) :
            return False
        
    return True

a = []
x = 2

while x <= 888 :
    if check(str(x)) :
        a.append(int(str(x) + str(x)[ :: -1]))
    x += 2

for i in range(int(input())) :
    n = int(input())
    
    for i in a :
        if i >= n :
            break
        print(i, end = ' ')
    print()
    
    