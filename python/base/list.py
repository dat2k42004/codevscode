#list
# list = [1, 2, 4]#single list
# print(list)
# print(list[1])#accessing elements
# list1 = [1, 2, 'nguyen', 3, 'dat']
# print(list1)
# l = [[1, 2], [1]]#multi_dimensional list
# print(l[1][0])
# #print(l[1][1])#error
# print(len(list))#size of list
# s=input()
# l = s.split()
# print(l)
# n = int(input())
# lst = list(map(int, input().strip().split()))[:n]#gioi han so luong ptu cua list
# print(lst)

##adding elements to list

#using list.append(data)
# list = []
# list.append(1)
# list.append(2)
# list.append((3, 4))#add tuples
# list.append(['nguyen', 'dat'])#add list
# print(list)
# for i in range(len(list)):
#     print(list[i], end = ' ')

#using list.insert(pos, data)
# list = [1, 2 , 3, 4]
# list.insert(1, 'it')
# print(list)

#using extend(): list.extend(data): add multi elements at the same time at the end of list
# list = list(map(int, input().strip().split()))[:4]
# list.extend([5, 6, 7])
# for i in range(len(list)):
#     print(list[i], end = ' ')
# else:
#     print('\nend run')

##reverse elements
# list1 = list(map(int, input().strip().split()))[:5]
# list1.reverse()//
# print(list1)
# list2 = list(reversed(list1))//
# print(list2)

##remove elements from the list

#using remove() method
list = list(map(int, input().strip().split()))[:4]
list.remove(2)
print(list)

#using pop(pos) method

# list = [1, 2, 3, 2]
# list.pop(1)
# print(list)

##slicing of list

# list = [1, 2, 3, 4, 5, 6, 7, 8, 9]
# l1 = list[2:5]
# l2 = list[3:]
# l3 = list[:]
# print(l1, l2, l3, sep = '\n')


## list comprehension:
# syntax: new_list = [element for element in old_list if condition]
# old_list = [1, 2, 3, 4, 5, 6]
# new_list = [int(x/2) for x in old_list if x%2==0]
# print(new_list)

# l = [x for x in range(11) if x%2==1]
# print(l)

# l = [x for x in [1, 2, 3]]
# print(l)

#matrix:
# m = [[j for j in range(3)] for i in range(3)]
# print(m)

# import time

# def for_loop(n):
#     result = []
#     for i in range(n):
#         result.append(i**2)
#     return result

# def list_comprehension(n):
#     return [i**2 for i in range(n)]

# if __name__ == '__main__':
#     begin = time.time()
#     for_loop(10**6)
#     end = time.time()
    
#     print(round(end - begin, 2))
    
#     begin = time.time()
#     list_comprehension(10**6)
#     end = time.time()
    
#     print(round(end - begin, 2))

# >>list_comprehension is faster than for_loop  
    
    
# matrix = [[j for j in range(i, i + 3)] for i in range(1, 8, 3)]
# print(matrix)

#lambda:
# a = list(map(lambda i : i*2, [i for i in range(1, 6)]))
# print(a)