a, k, n = map(int, input().split())

cnt = 0
for i in range(int(a / k) + 1, int(n / k) + 1) :
    cnt += 1
    print(i * k - a, end = ' ')
    
        
if cnt == 0 :
    print(-1)
    