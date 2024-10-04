import array as arr
##create array: array(data_type, value_list)
# a = arr.array('i', [1, 2, 3])#i: integer
# for i in range(0, 3):
#     print(a[i], end = ' ')
# else:
#     print('\nendrun')
    
# b = arr.array('d', [2.5, 2.3, 2.4])# d: double
# for i in range(0, 3):
#     print(b[i], end = ' ')

##adding elements to array:
    #using insert(pos, value) function:


# a.insert(1, 4)
# for i in (a):
#     print(i, end=' ')
    
    #using append(value) function:(add value in the end of array)
# a.append(4)
# for i in (a):
#     print(i, end = ' ')

## accessing elements from array:
# print(a[0])

## removing elements from array:
    # using remove(pos) function:
# a.remove(1)
# for i in (a):
#     print(i, end = ' ')
# print()
   
#     #using pop(pos) function: (pop and use val)
# print(a.pop(1))
# for i in (a):
#     print(i, end = ' ')


## slicing of array:
    
# l = [1, 2, 3, 4, 5, 6, 7]

# a = arr.array('i', l)
# for i in (a):
#     print(i, end = ' ')
# print()

# sliced_array = a[2:5]#[:][2:][:4]
# print(sliced_array)

# for i in (sliced_array):
#     print(i, end = ' ')

## searching elements in array: using index(pos) function:(find the index of 1st occurrence(tan xuat xay ra) of the integers start of 0)

# t = (1, 2, 3, 4, 5, 6)
# a = arr.array('i', t)
# print(a)
# print(a.index(3))


## another operation on array:

l = list(map(int, input().strip().split()))[:5]
a = arr.array('i', l)
print(*a)
print(*l)
#   # count(val):
# print(a.count(2))

#   #reverse():
# a.reverse()
# print(*a)

#   #extend():

l = list(map(int, input().split()))[:5]
a.extend(l)
print(*a)





