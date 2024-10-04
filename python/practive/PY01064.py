f = [0] * 26

def init():
    f[1] = 1
    for i in range(2, 26) :
        f[i] = 2 * f[i - 1] + 1


def find(n, k) :
    res = int(f[n] / 2) + 1 
    if k == res :
        return chr(n + 64)
    elif k > res :
        return find(n - 1, k - res)
    else :
        return find(n - 1, k)        

init()

for i in range(int(input())) :
    n, k = map(int, input().strip().split())
    
    print(find(n, k))
