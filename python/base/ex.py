s = input()

for i in s :
    if (i > '9' or i < '0') and i != '.' :
        print('invalid')
        exit(0)

res = '' 
b = s.split('.')
s = ''.join(b)
s = str(int(s))
for i in range(len(s) - 1, -1, -3) :
    if i - 3 > 0 :
        res = ',' + s[(i - 2) : (i + 1)] + res
    else :
        res = s[0 : i + 1] + res
print(res)