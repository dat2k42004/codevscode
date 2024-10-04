def cmp(a) :
    return a
n = int(input())
a = [int(x) for x in input().split()]

a.sort(key = cmp, reverse = True)

res1 = max(a[0] * a[1], a[0] * a[1] * a[2])
res2 = max(a[-1] * a[-2], a[-1] * a[-2] * a[0])

print(max(res1, res2))
