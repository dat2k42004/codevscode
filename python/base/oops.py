### @class and object

# class class_name:
#     statement 

# obj = class_name()
# print(obj.state)


##ex:
# class name:
    
#     atrr1 = "people"
#     atrr2 = "man"
    
#     def fun(self):
#         print("i'm a", self.atrr1)
#         print("i'm a", self.atrr2)
        
# Dat = name()
# print(Dat.atrr1)
# Dat.fun()

##self parameter

# class student:
#     def __init__(self, name, school):
#         self.name = name
#         self.school = school
    
#     def show(self):
#         print("i'm " + self.name, "i study in " + self.school, sep = '\n')
    
#     def __str__(self):
#         return f"my name is {self.name} and i study in PTIT"
#     pass
# a, b = map(str, input().split())
# # a = input()
# # b = input()

# obj = student(a, b)

# obj.show()

# print(obj)


## polymorphism

# class vietnam:
#     def capital(self):
#         print("HA NOI")
#     def language(self):
#         print("Tieng Viet")
#     def where(self):
#         return "ASIAN"
#     pass

# class england:
#     def capital(self):
#         print("LONDON")
#     def language(self):
#         print("English")
#     def where(self):
#         return "EUROPEAN"
#     pass
# def func(obj):
#     obj.capital()
#     obj.language()
    
# obj1 = vietnam()
# obj2 = england()

# for country in (obj1, obj2):
#     country.capital()
#     country.language()

# func(obj1)

# countryside = [vietnam(), england()]

# for country in countryside:
#     print(country.where())
    
    
## inheritance
# class person(object):
#     def __init__(self, name, id):
#         self.name = name
#         self.id = id
#     def display(self):
#         print(self.name, self.id)
        
#     pass

# emp = person("dat", 195)
# emp.display()
# print('---------')
# class Emp(person):
#     def __init__(self, name, id, age):
#         self.age = age
#         person.__init__(self, name, id)
#     def print(self):
#         print(self.age)
#         print("Emp class call")
    
#     pass


# class student(person):
#     def __init__(self, name, id):
#         self._name = name
#         self._id = id
        
#         super().__init__("trung", 216)
#     def display_info(self):
#         print(self._name, self._id)
        
#     pass
    
# Emp_details = Emp("dat", 195, 19)

# Emp_details.display()
# Emp_details.print()
    
# print('---------')

# obj = student('dat', 195)
# obj.display()
# obj.display_info()


## different types of inheritance
# class base1(object):
#     def __init__(self):
#         self.str1 = "dat1"
#         print("base1")
        
#     pass

# class base2(object):
#     def __init__(self):
#         self.str2 = "dat2"
#         print("base2")
    
#     pass
# class derived(base1, base2):
#     def __init__(self):
#         base1.__init__(self)
#         base2.__init__(self)
        
#         print("derived")
        
#     def print_str(self):
#         print("-_-")
#         print(self.str1, self.str2)
        
#     pass

# obj = derived()

# obj.print_str()

## multilevel inheritance

# class base(object):
#     def __init__(self, name):
#         self.name = name
        
#     def get_name(self):
#         return self.name
    
#     pass

# class child(base):
#     def __init__(self, name, age):
#         base.__init__(self, name)
#         self.age = age
        
#     def get_age(self):
#         return self.age
    
#     pass

# class grand_child(child):
#     def __init__(self, name, age, id):
#         child.__init__(self, name, age)
#         self.id = id
        
#     def get_id(self):
#         return self.id
    
#     pass

# obj = grand_child("trung", 19, "KH216")
# print(obj.get_name(), obj.get_age(), obj.get_id(), sep = '\n')


## private members of parent class:

# class C(object):
#     def __init__(self):
#         self.c = 21
#         self.__d = 32
#     pass

# class D(C):
#     def __init__(self):
#         self.e = 43
#         C.__init__(self)
        
#     pass
# obj1 = D()
# print(obj1.c)
# print(obj1.__d) # error


## abstract 


