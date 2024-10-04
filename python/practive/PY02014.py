f = [1] * 10001
def init() :
    f[0] = f[1] = 0
    for i in range(2, 101) :
        for j in range(i * i, 10001, i) :
            f[j] = 0            
init()
a = [x for x in range(10001) if f[x] == 1]

def calcu(n) :
    for i in range(len(a) - 1) :
        if n > a[i] and n < a[i + 1] :
            return min(n - a[i], a[i + 1] - n) 
        
        
n = int(input())
l = [int(x) for x in input().split()]

res = 0
for i in l :
    if f[i] == 0 :
        res = max(res, calcu(i))

print(res)

