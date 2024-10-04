t = int(input())
for i in range(t) :
    a = sorted(list(input()))
    b = sorted(list(input()))
    print('Test {}: '.format(i + 1), 'YES' if a == b else 'NO')        
        
   