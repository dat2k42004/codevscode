##set#khong theo thu tu, khong lap

#creating set
# set1 = {}
# print(set1)

# set2 = set('nguyenducdat')
# print(set2)

# set3 = set(['nguyen', 'duc', 'dat'])
# print(set3)

# set4 = set(('nguyen', 'dat'))
# print(set4)

# d = {'geeks':1, 'for':2, 'geeks':3}
# print(set(d))

# set1 = {1, 2, 4}
# print(set1)

# list1 = [1, 2, 3, 4]
# set1 = set(list1)
# print(set1)

# set1 = set([1, 3, 5, 2, 1, 3])
# print(set1)

#add elements to set
#using method
# set1 = set()
# set1.add(1)
# set1.add(2)
# set1.add((6, 7))
# # set1.add([4, 5])#error
# print(set1)

#using update

# set1 = set([1, 2, (3, 4)])
# set1.update([10, 11])
# print(set1)



##accessing set
# set1 = set(['nguyen', 'duc', 'dat'])
# print(set1)
# for i in set1:
#     print(i, sep = '\n')
# else: 
#     print('end run')
# print('dat' in set1)

##removing elements from set

#using remove() method
# set1 = set([1, 2, 3, 4, 5, 3, 5])
# set1.remove(1)#can remove element exist in set
# print(set1)

#using discard() method
# set1 = {1, 2, 3, 4, 5, 7, 3}
# set1.discard(6)
# set1.remove(6)#error
# print(set1)

#using pop() method
# set1 = {1, 2, 4, 3, 5, 7, 1}
# set1.pop()
# print(set1)

#using clear()
# set1 = {'nguyen', 'duc', 'dat'}
# print(set1)
# set1.clear()
# print(set1)

##frozen set
# string = 'nguyenducdat'
# fset = frozenset(string)
# print(fset)
# print(frozenset())

##function
# set1 = {1, 2, 3}
# set2 = {3, 4, 5, 1, 2}
#copy()
# set1 = set2.copy()
# print(set1)
# #union()
# new_set = set1.union(set2)#hop
# print(new_set)

# my_set = set1.difference(set2)#khac
# print(my_set)
# my_set = set1.symmetric_difference(set2)#doi xung khac
# print(my_set)
# #set1.difference_update(set2)#function remove all elements in another set
# # print(set1)

# my_set = set1.intersection(set2)#giao
# print(my_set)
# # set1.intersection_update(set2)
# # print(set1)

# my_set = set1.isdisjoint(set2)#return true if have a null intersection
# print(my_set)

# my_set = set1.issubset(set2)#return true if set1 is contained in set2
# print(my_set)