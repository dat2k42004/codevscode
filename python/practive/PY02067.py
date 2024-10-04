n = int(input())

a = [int(x) for x in input().split()]

res = min(a)
res = int(res / 2) + 1

sum = 0
for i in a :
    sum += int(i / res) + 1
print(sum)
