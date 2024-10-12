n : int = int(input()) + 1
a = [int(x) for x in input().split()] + [-1]

cnt, x, res = 0, 0, max(a)

for i in range(n) :
    if a[i] == res :
        x += 1
    else :
        cnt = max(cnt, x)
        x = 0
print(cnt)