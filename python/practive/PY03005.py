n, k = map(int, input().split())

d = {}

for i in range(n) :
    s = input().lower() + ' '
    res = ''
    for j in s :
        if (j >= '0' and j <= '9') or (j >= 'a' and j <= 'z') :
            res += j
        else :
            if res != '' :
                if res in d :
                    d[res] += 1
                else :
                    d[res] = 1
                res = ''

sort_dict = sorted(d.items(), key = lambda x : (-x[1], x[0]))
# print(n, k)
for i in sort_dict :
    # print(i[0], i[1])
    if i[1] >= k :
        print(i[0], i[1])
    else :
        break
