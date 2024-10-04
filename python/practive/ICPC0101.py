n = input()
a = list(map(int, input().split()))
st = []

for x in a:
    if(len(st) == 0 or (x + st[-1]) & 1):
        st.append(x)
    else:
        st.pop(-1)
print(len(st))