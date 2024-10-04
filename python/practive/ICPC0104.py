t = int(input())

for i in range(t):
    n = input()
    
    n = n + 'a'
    
    ans = 10 ** 20
    
    res = 0
    for i in range(len(n)):
        if n[i].isalpha() :
            if i != 0 and n[i - 1].isdigit() :
                ans = min(ans, res)
                res = 0
            
        else:
            res = res * 10 + int(n[i])
            
    print(ans)
    
    
    