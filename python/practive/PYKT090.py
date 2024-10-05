d = {}

f = open('CONTACT.in', 'r')

for x in f :
    if x[-1] == '\n' :
        x = x[ : -1] 
    d[x.lower()] = 1
    
d = sorted(d.keys())

for x in d :
    print(x)
    