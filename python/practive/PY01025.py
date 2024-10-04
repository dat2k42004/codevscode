s = input()

res = ''

i = len(s)
while i >= 0 :
    if i - 3 > 0 :
        res = ',' + s[i - 3 : i] + res
        
    elif i - 3 <= 0 :
        res = s[0 : i] + res
        
    i -= 3

print(res)
	
# 153,920,529