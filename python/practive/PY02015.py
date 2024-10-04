def check(a):
    for i in range(3) :
        if a[i] != a[i + 1] :
            return False
    return True

while True :
    a = list(map(int, input().split()))
    
    if check(a) and a[0] == 0 :
        break

    cnt = 0
    while not(check(a)) :
        x = a[0]
        for i in range(3) :
            a[i] = abs(a[i] - a[i + 1])
        a[3] = abs(x - a[3])
        cnt += 1
    print(cnt)