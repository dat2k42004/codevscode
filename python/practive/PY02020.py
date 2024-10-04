n = int(input())

a = sorted(list(map(float, input().split())))


res = 0.0
cnt = 0
for i in a[1 : -1] :
    if i != a[0] and i != a[-1]:
        res += i
        cnt += 1    
print("%.2f" %(res / cnt))

