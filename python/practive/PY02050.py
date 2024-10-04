for i in range(int(input())) :
    n = int(input())
    
    a = [int(x) for x in input().split()]
    
    st = []
    
    for i in range(len(a)) :
        if len(st) == 0 :
            st.append(i)
            print(i + 1, end = ' ')
            
        else :
            while len(st) :
                x = st.pop()
                if a[x] > a[i] :
                    st.append(x)
                    break 
                
            if len(st) == 0 :
                print(i + 1, end = ' ')
            else :
                x = st.pop()
                print(i - x, end = ' ')
                st.append(x)
            st.append(i)
    print()