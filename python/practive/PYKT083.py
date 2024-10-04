chair = [5, 7, 2, 29, 45]
cost = [10000, 15000, 20000, 50000, 70000]
a = []
s = []
for i in range(int(input())) :
    l = input().strip().split()
    a.append(l)
    if s.count(l[4]) == 0 :
        s.append(l[4])
    
for i in s :
    res = 0
    for j in a :
        if i == j[4] and j[3] == 'IN' :
            res += cost[chair.index(int(j[2]))]
            
    print(i + ':', res)
    

