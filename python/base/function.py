
# def name():
#     global s
#     s += ' dat'
#     print(s)

# if __name__ == '__main__':
#     s = 'nguyen duc'
#     name()


## return statement:

# def function_name():
#     statement
#     ...
#     return [expression]


# def is_true(a):
#     return bool(a)

# print(is_true(2<5))


## return multiple value:
# (using class):

# class text:
#     def __init__(self):
#         self.name = "nguyen duc dat"
#         self.age = 19
        
# def access():
#     return text()

# t = access()
# print(t.name, t.age, sep = "\n")

# (using tuple/list/dictionary):

# def __init__():
#     name = "nguyen duc dat"
#     age = 19
#     return (name, age)

# name, age = __init__()

# print(name, age, sep = '\n')


## function return another function:

# def create_add(x):
#     def _add(y):
#         return x + y
#     return _add

# def _mul(x):
#     return x*2

# def call():
#     return _mul

# add_ = create_add(10)
# print(add_(10))
# mul_ = call()
# print(mul_(10))


## concatenation of 2 range() functions using itertools chain() method:

# from itertools import chain

# res = chain(range(5), range(10, 0, -2))
# for i in res:
#     print(i, end = ' ')
    

## access range() with index value:
# ele = range(3, 10)[5]
# print(ele)

## using "self" as default argument:

# class create_topic:
#     def __init__(self, topic):
#         self.topic = topic
        
#     def display(self):
#         print('Topic:', self.topic)
        
# instance = create_topic("Python")

# instance.display()

## closure:
# def outer_function(text):
    
#     def inner_function():
#         print(text)
        
#     return inner_function
        
# if __name__ == '__main__':
#     my_function = outer_function('python')
#     my_function()


## map() function:

#syntax: map(function, iterable)
# def addition(n):
#     return n + n

# num = (1, 2, 3, 4, 5)
# result = map(addition, num)
# print(tuple(result))

#using map and lambda:
# num1 = [1, 2, 3]
# num2 = [4, 5, 6]

# result = map(lambda x, y: x + y, num1, num2)
# print(tuple(result))


## filter:

# def fun(var):
#     letter = ['a', 'e', 'i', 'o', 'u']
#     if(var in letter):
#         return True
#     else:
#         return False

# sentence = 'nguyenducdat'
# result = filter(fun, sentence)
# for s in result:
#     print(s, end = ' ') 
 
# using with lambda:
# sen = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
# result = filter(lambda x : x%2 == 0, sen)
# print(list(result))   

# def check(var):
#     return var%2 == 0

# sen = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
# result1 = list(filter(check, sen))
# result2 = list(filter(lambda x: check(x), sen))
# print(result1, result2, sep = '\n')

##reduce():
# import functools
# import operator
# import itertools
# l = [1, 3, 5, 7, 9]

# print(functools.reduce(lambda a, b: a + b, l))
# print(functools.reduce(lambda x, y: x if x>y else y, l))

# print(functools.reduce(operator.mul, l))
# print(functools.reduce(operator.add, l))

# print(list(itertools.accumulate(l, lambda x, y: x+y))) #prefix sum


## @lambda
# string = 'python'

# upper1 = lambda x : x.upper()

# print(upper1(string))


# format_number = lambda x: f"{x:e}" if isinstance(x, int) else f"{x:,.2f}"
# print(format_number(100), format_number(10.1), sep = '\n')










 
