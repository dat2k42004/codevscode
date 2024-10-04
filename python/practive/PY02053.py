n = int(input())

a = []

for i in range(n) :
    l = [int(x) for x in input().split()] 
    
    a.append(l)
    
k = int(input())

res1 = 0
res2 = 0

for i in range(n) :
    for j in range(0, n - i - 1) :
        res1 += a[i][j]
        
    for j in range(n - i, n) :
        res2 += a[i][j]
        
if abs(res1 - res2) <= k :
    print("YES")
else :
    print("NO")
print(abs(res1 - res2))
