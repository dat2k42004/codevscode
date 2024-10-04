s = input()

while len(s) > 1 :
    n = int(len(s) / 2)
    
    s = str(int(s[ : n]) + int(s[n : ]))
    
    print(s)
    
    