s = '0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ'

for i in range(int(input())) :
    n, k = map(int, input().split())
    a = []
    while n > 0 :
        a.append(s[n % k])
        n = int(n / k)
    
    res = ''.join(a)
    print(res[ :: -1])