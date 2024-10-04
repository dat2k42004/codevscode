s = input()

if len(s) & 1 :
    s = s[ : len(s) - 1]
    
a = []

for i in range(0, len(s), 2) :
    if a.count(int(s[i : (i + 2)])) == 0 :
        a.append(int(s[i : (i + 2)]))
print(*a)