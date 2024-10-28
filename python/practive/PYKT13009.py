mod = int(1e9 + 7)
for _ in range(int(input())) :
    n, k = [int(x) for x in input().split()]
    res = 0
    for i in range(1, n + 1) :
        res = (res + i ** k) % mod
    print(res)
    

