x = 0
a = [0] * 42

while True :
    l = list(map(int, input().split()))
    
    x += len(l)
    
    for i in l :
        a[i % 42] += 1
    if x == 10 :
        break
    
cnt = 0
for i in range(len(a)) :
    if a[i] > 0 :
        cnt += 1
        
print(cnt)