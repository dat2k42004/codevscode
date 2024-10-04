a = []
n = int(input())
for i in range(n) :
    a.append(input())
res = 0    
for i in range(n) :
    x = 0
    y = 0
    for j in range(n) :
        if a[i][j] == 'C' :
            x += 1
        if a[j][i] == 'C' :
            y += 1
    if x >= 2 :
        res += int(x * (x - 1) / 2)
    if y >= 2 :
        res += int(y * (y - 1) / 2)

print(res)
