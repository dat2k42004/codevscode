n, m = map(int, input().split())

a = set(sorted([int(x) for x in input().split()]))
b = set(sorted([int(x) for x in input().split()]))

if a == b :
    print('YES')
else :
    print('NO')
    
