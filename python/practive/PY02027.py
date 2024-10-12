a = []
def isnum(a) :
    if a >= '0' and a <= '9' :
        return True
    return False
for i in range(int(input())) :
    s = input()
    j = 0
    while j < len(s) :
        if isnum(s[j]) :
            k = j + 1
            while k < len(s) and isnum(s[k]) :
                k += 1
            a.append(int(s[j : k]))
            j = k
        else :
            j += 1

a = sorted(a)
print(*a, sep = '\n')

