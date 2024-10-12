def check(x) :
    for i in a : 
        if int(i / x) == int(i / (x + 1)) :
            return 0
    return 1


n = int(input())

a = [int(x) for x in input().split()]

res = min(a)
sum = 0

for i in range(res, 0, -1) :
    if check(i) :
        for j in a :
            sum += int(j / (i + 1)) + 1
        break
print(sum)