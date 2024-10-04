n = int(input())

a = sorted([int(x) for x in input().split()])

for i in a :
    if i + 1 not in a :
        print(i + 1)
        break