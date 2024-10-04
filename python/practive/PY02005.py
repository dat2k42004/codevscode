n = int(input())

l = list(map(int, input().split()))

a = [0] * len(l)
res = 0
for i in range(len(l) - 2, -1, -1) :
    j = i + 1
    while j < len(l) :
        if l[j] < l[i] :
            a[i] += 1
        j += 1    
    res += a[i]

print(res)
