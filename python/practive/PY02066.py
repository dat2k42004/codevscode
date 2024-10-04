n = int(input())

a = []
while True :
    l = [int(x) for x in input().split()]
    a += l
    if len(a) == n :
        break

k = max(a)

f = [0] * (k + 1)
ok = False
for i in a :
    f[i] += 1
for i in range(1, k + 1) :
    if f[i] == 0 :
        print(i)
        ok = True
if not(ok) :
    print('Excellent!')
