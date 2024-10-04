n = int(input())
a = [int(x) for x in input().split()]
k = -1 
res = pow(10, 18)

for i in a :
    cnt = 0
    for j in a :
        cnt += abs(i - j)
    if cnt < res :
        res = cnt
        k = i
        
print(res, k)
