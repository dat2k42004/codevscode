x1 = [40, 38, 36, 34, 32, 29, 26, 22, 19, 15, 12, 9, 6, 4]
y1 = [39, 37, 35, 33, 30, 27, 23, 20, 16, 13, 10, 7, 5, 3]
f = [9.0, 8.5, 8.0, 7.5, 7.0, 6.5, 6.0, 5.5, 5.0, 4.5, 4.0, 3.5, 3.0, 2.5]

def change(a) :
    for i in range(14) :
        if a >= y1[i] and a <= x1[i] :
            return f[i]
t = int(input())

for i in range(t) :
    a = [str(x) for x in input().strip().split()]
    sum = change(int(a[0])) + change(int(a[1])) + float(a[3]) + float(a[2])
    sum = round(sum / 4, 2)
    x = int(sum)
    y = sum - x
    if y < 0.25 :
        y = 0.0
    elif y < 0.75 :
        y = 0.5
    else :
        y = 0.0
        x += 1
    print('{:.1f}'.format(x + y))

