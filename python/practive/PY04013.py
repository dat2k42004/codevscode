def time(x, y) :
    return y[0] * 60 + y[1] - x[0] * 60 - x[1]  

a = {}  
n = int(input())
for i in range(n) :
    addr = input()
    x = [int(i) for i in input().split(':')]
    y = [int(i) for i in input().split(':')]
    tra = int(input())
    res = time(x, y)
    if addr not in a :
        a[addr] = (tra, res)
    else  :
        a[addr] = (a[addr][0] + tra, a[addr][1] + res)
        
t = 1   
for i in a :
    print('T{:02d}'.format(t), i, '{:.2f}'.format(a[i][0] * 60 / a[i][1]))
    t += 1