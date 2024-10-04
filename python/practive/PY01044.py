a = set(sorted([str(x).lower() for x in input().strip().split()]))
b = set(sorted([str(x).lower() for x in input().strip().split()]))
s1 = sorted(a.intersection(b))
s2 = []
for i in s1 :
    s2.append(i)
for i in a.symmetric_difference(b) :
    s2.append(i)
s2 = sorted(s2)
print(*s2)
print(*s1)
