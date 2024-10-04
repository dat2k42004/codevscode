t = int(input())

for i in range(t) :
    s = input()
    res = ''
    cnt = 0
    for i in s :
        if i.isalpha() :
            res += i
        else :
            cnt += int(i)
    a = list(res)
    a.sort()
    
    print(''.join(a) + str(cnt))
