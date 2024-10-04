s = input()
cnt = 0
while len(s) > 1 :
    cnt += 1
    res = 0
    for i in s :
        res += ord(i) - 48
    s = str(res)
            
print(cnt)