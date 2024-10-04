def cmp(z) :
    return z
n = int(input())

a = []
while True :
    l = [int(x) for x in input().split()]
    a += l
    if len(a) == n :
        break

b = [x for x in a if x % 2 == 1]
c = [x for x in a if x % 2 == 0]

b.sort(key = cmp, reverse = True)
c.sort(key = cmp, reverse = False)
x = 0
y = 0
for i in a :
    if i & 1 :
        print(b[x], end = ' ')
        x += 1
    else :
        print(c[y], end = ' ')
        y += 1
        
 

