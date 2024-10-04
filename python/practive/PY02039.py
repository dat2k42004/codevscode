n = int(input())

a = []

for i in range(n) :
    l = [int(x) for x in input().split()]
    
    a.append(l)
    
k = int(input())

res1 = 0
res2 = 0
for i in range(n) :
    for j in range(n) :
        if j > i :
            res1 += a[i][j]
        elif j < i :
            res2 += a[i][j]

if abs(res1 - res2) <= k :
    print("YES")
else :
    print('NO')
print(abs(res1 - res2))