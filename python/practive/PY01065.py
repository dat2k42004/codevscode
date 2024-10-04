def check(a, calcu, b, res) :
    if calcu == '+' :
        return a + b == res
    elif calcu == '-' :
        return a - b == res
    elif calcu == '*' :
        return a * b == res
    elif a % b == 0 :
        return a // b == res
    return False

def change1(num) :
    a = []
    if num[0] == '?' :
        for i in range(1, 10) :
            a.append(str(i) + num[1 : ])
    else :
        a.append(num)
    res = []
    if num[1] == '?' :
        for i in a :
            for j in range(0, 10) :
                res.append(i[0] + str(j))
    else : res = a
    return res
def change2(nnum) :
    if nnum == '?' : 
        return '+-*/'
    return [nnum]

def solve(s) :
    a = s.split()
    x = change1(a[0])
    y = change2(a[1])
    z = change1(a[2])
    t = change1(a[4])
    
    for i in x :
        for j in y :
            for k in z:
                for h in t :
                    if check(int(i), j, int(k), int(h)) :
                        print('{} {} {} = {}'.format(i, j, k, h))
                        return
    print('WRONG PROBLEM!')
    
for i in range(int(input())) :
    solve(input())
    
