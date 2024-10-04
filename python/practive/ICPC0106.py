import math
f = ['0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F']

t = int(input())

for i in range(t):
    n = int(input())
    
    s = input()
    
    n = int(math.log(n) / math.log(2))
    
    while len(s) % n != 0 :
        s = "0" + s
    
    for i in range(0, len(s), n):
        res = 0
        for j in range(i, i + n):
            if(s[j] == '1'):
                res += pow(2, n - j + i -1)
        
        print(f[res], end = "")
        
    print()
    