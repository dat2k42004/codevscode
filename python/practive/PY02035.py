s = input()
k = int(input())

if len(s) & 1 :
    s = s[ : len(s) - 1]
    
a = []
for i in range(0, len(s), 2) :
    a.append(int(s[i : (i + 2)]))
a.sort()   
b = []
ok = False
for i in a :
    if b.count(i) == 0 and a.count(i) >= k :
        print(i, a.count(i))
        b.append(i)
        ok = True
        
if not(ok) :
    print('NOT FOUND')