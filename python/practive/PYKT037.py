s = '0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ'

for i in range(int(input())) :
    n, k = map(int, input().split())
    
    a = ''
    
    while n > 0 :
        a = s[int(n % k)] + a
        n = int(n / k)
    print(a)
