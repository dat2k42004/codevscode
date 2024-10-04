n = int(input())

a = [input().strip() for _ in range(n)]

for i in a :
    if len(i) < 100 :
        print(i)
    else :
        j = 98
        while i[j].isalpha() :
            j -= 1
        print(i[ : j])
    
