x = [1, 1, 0, -1, -1, -1, 0, 1]
y = [0, -1, -1, -1, 0, 1, 1, 1]

m, n = map(int, input())

a = []
for i in range(m) :
    l = [int(x) for x in input().split()] 
    a.append(l)
res = 0
for i in range(m) :
    for j in range(n) :
        for k in range(8) :
            x = i + x[k]
            y = j + y[k]
            if x >= 0 and x < m and y >= 0 and y < n and a[x][y] != -1 :
                res += 1
                a[x][y] = -1
                
                
print(res)

