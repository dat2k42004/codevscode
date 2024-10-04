def c(n) :
    if n < 2 :
        return 0
    return int(n * (n - 1) / 2)

n = int(input())

a = []

for i in range(n) :
    s = input()
    a.append(list(s))
    

res = 0

for i in range(n) :
    x = 0
    y = 0
    for j in range(n) :
        if a[i][j] == 'C' :
            x += 1
        if a[j][i] == 'C' :
            y += 1
            
    res += c(x) + c(y)
    
print(res)

