t = int(input())

for i in range(t) :
    n = int(input())
    a = [int(x) for x in input().split()]
    cnt = 0
    for i in range(n - 1) :
        y = max(a[i], a[i + 1])
        x = min(a[i], a[i + 1])
        while x * 2 < y :
            x *= 2
            cnt += 1
            
    print(cnt)
        