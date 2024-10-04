n = int(input())

l = list(map(int, input().split()))
res = 0
for i in range(len(l) - 1) :
    if l[i] != l[i + 1] :
        res += 1
print(res)
