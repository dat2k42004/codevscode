for i in range(int(input())) :
    n = input()
    
    cnt = 0
    
    while True :
        cnt += 1
        if int(n) % 7 == 0 :
            print (n)
            break
        
        if cnt == 1000 :
            print(-1)
            break
        
        n = str(int(n) + int(n[ :: -1]))
