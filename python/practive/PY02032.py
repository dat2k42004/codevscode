s = input()

a = set()
if len(s) % 2 == 1 :
    res = s[0 : len(s) - 1]
else :
    res = s
for i in range(0, len(res), 2) :
    a.add(int(res[i : (i + 2)]))
    
print(*sorted(a))