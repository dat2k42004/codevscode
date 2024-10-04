from itertools import combinations
n, k = map(int, input().split())

a = list(sorted(set([str(x) for x in input().strip().split()])))

n = len(a)

x = combinations(a, k)

y = [' '.join(i) for i in x] 
for i in y :
    print(i)

