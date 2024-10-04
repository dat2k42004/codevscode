n, k = map(int, input().split())

a = sorted([int(x) for x in input().split()])

cnt = 1
for i in range(1, len(a)) :
    if a[i] - a[i - 1] > k :
        cnt += 1
        
print(cnt)
