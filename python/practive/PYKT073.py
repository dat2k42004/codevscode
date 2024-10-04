n = int(input())
a = []

for i in range(n) :
    l = [x for x in input().split()]
    a.append(len(l))
res = []
i = 0
while i < n :
    if a[i] == 7 :
        j = i
        while j < n and a[j] == 7 :
            j += 1
        for k in range(i, j, 4) :
            res.append(2)
        i = j
    else :
        res.append(1)
        while i < n and a[i] != 7 :
            i += 1

print(len(res))
for i in res :
    print(i)
    
