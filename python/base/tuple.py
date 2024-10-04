##tuple
#create
# tuple1 = ()
# print(tuple1)

# tuple1 = ('nguyen', 'dat')
# print(tuple1)

# list1 = [1, 2, 3]
# print(tuple(list1))

# tuple = tuple('nguyen')
# print(tuple)

# tuple1 = (1, 2, 3)
# tuple2 = ('nguyen', 'dat')
# tuple3 = (tuple1, tuple2)
# print(tuple3)

# tuple1 = ('dat',)*3 #!=('dat,')*3
# print(tuple1)

# tuple1 = ('dat')#chi in ra xau

# print(tuple1)
# n = 5
# for i in range (n):
#     tuple1 = (tuple1,)
#     print(tuple1)

##tuple operator

#accessing
# tuple1 = tuple('nguyenducdat')
# print(tuple1[0])
# tuple2 = ('nguyen', 'duc', 'dat')
# a, b, c = tuple2
# print(a, b, c, sep = '\n')

#concatenation
# tuple1 = (1, 2)
# tuple2 = ('nguyen', 'dat')
# tuple3 = tuple1 + tuple2
# print(tuple3)

#slicing
# tuple1 = tuple('nguyenducdat')
# print(tuple1[1:3])
# print(tuple1[0:])
# print(tuple1[::-1])#reverse

#methods
# print(tuple1.index('g'))#tim
# print(tuple1.count('n'))#dem 

#functions
# tuple1 = (2, 4, 1, 5, 3)
# print(all(tuple1))#return true if(empty || all elements true) and return false if(exist element false)
# print(any(tuple1))#return false if empty
# print(len(tuple1))
# print(enumerate(tuple1))
# print(max(tuple1))
# print(sum(tuple1))
# print(tuple(sorted(tuple1)))#sorted return list