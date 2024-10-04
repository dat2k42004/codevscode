s = input()

if len(s) & 1:
    s = s[ : len(s) - 1]
    
a = [] 
for i in range(0, len(s), 2) :
    a.append(s[i : (i + 2)])
b = []

for i in a :
    if b.count(i) == 0 :
        print(i, a.count(i))
        b.append(i)
        