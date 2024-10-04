def gcd (a, b) :
    if b == 0 :
        return a
    else :
        return gcd (b, a % b)
    

n, k = map(int, input().split())
res = 0
for i in range(10 ** (k - 1), 10 ** k) :
    if gcd (i, n) == 1 :
        print(i, end = ' ')
        res += 1
        if res % 10 == 0 :
            print()
    
           