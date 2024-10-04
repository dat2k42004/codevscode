n = int(input())

a = [] 
for i in range(n) :
    a.append(input().strip( ))
i = 0
while i < len(a) :
    j = i
    while j < len(a) and a[j] != '' :
        j += 1
    print(a[i] + ':', j - i - 1) 
    i = j + 1 
    
