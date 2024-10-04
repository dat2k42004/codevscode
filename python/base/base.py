# print("hello", 'world', sep=' ', end='\n')# sep: ki tu giua cac tu
#end: ket thu cac ki tu
# print(1)
#xin chao cac ban
"""toi yeu cac ban
"""
# variable
# a = 100#ten bien k co dau cach, k cac ki tu dac biet
# print(type(a))#kieu du lieu cua a
# b = 20
# print(a*b)


# data type: int, float, complex
# a = 2+3j
# print('kieu du lieu cua bien a la', type(a))

# big int
# co the lu so nguyen lon

# he co so
# a=0b1001#nhiphan
# b=0o23#he 8
# c=0XA56#he 16

# float number
# a=1.8e308
# b=5.0e-324
# print(a, b, sep='\n')

# in sau dau phay
# a=1.137484
# print('%.2f' % a)
# print(round(a, 2))
# print('{:.2f}'.format(a))

#kieu bool
# a=True
# b=0#false
# b=''#false
# print(bool(b))
# print(type(a))


#xau ki tu

# s='nguyen duc dat'
# print(s)
# print(type(s))
# r="""nguyen duc dat
# b22dccn195"""
# print(r)

#ep kieu du lieu
# a=int(123)#string to int
# b=int('1213')
# s='134'
# c=int(s)
# d=float(13)
# print(d)
# s=str(a)#int to string

#toan tu
#toan tu gan
# a, b = 100, 200
# a, b =b, a
# print(a, b)

#toan tu toan hoc
# // chia nguyen
# ** luy thua
# a=2
# b=9
# print(a**b, b//a)


#toan tu so sanh nhu c++
#print(100==100)

#toan tu logic
# and, or, not
# (10<20)and(10>12)

#toan tu nhan dang
# a=[1, 2, 3]
# b=[1, 2, 3]
# print(id(a))
# print(a is b)#true neu a same b(doi tuong trong o nho)

#toan tu thanh vien
# s='nguyen duc dat'
# print('dat' in s)


#ham nhap input
# a=int(input())#nhap kieu xau ki tu str=> can ep kieu du lieu
# print(type(a))
# s=input('nhap xau: ')
# print(s)
# b=input()
# c=b.split()#tach xau boi dau cach
# x, y, z=map(int, c)#ep cac phan tu trong list thanh kieu du lieu mong muon
# print(x, y, z)
# a, b, c=map(int, input().split())#gon cach nhap

#cac ham toan hoc
#import math #khai bao dung ham
#from math import *
#print(help(math))
#print(math.sqrt(36))#return float
#print(isqrt(26))#lay phan nguyen
#print(pow(2, 10))
#ceil
# print(ceil(2.3))
# #floor
# print(floor(2.7))
# #factorial
# print(factorial(10))
# #gcd
# print(gcd(100, 20))
# #comb
# print(comb(5, 2))
# print(abs(12-17))
# print(max(1, 3, 4, 4, 9))

#if 
#if condition
    #code
#a, b=map(int, input().split())
# if a>b:
#     print(a, 'lon hon', b)

#if_else
# if a>b:
#     print(a, '>', b)
# else:
#       print(a, '<', b)

#if_elif_else
# co the dung if tren 1 dong, phan cach bang dau ';'

#toan tu 3 ngoi
# res='dung' if a<b else 'sai'
# print(res)

#for_range

# for x in range(1, 11, 1): # duyet 10 so tu 1-10
#     print(x, end=' ')
# a=range(1, 10, 1)
# print('\n')
# for x in a:
#     print(x, end=' ')
#     x+=1# k anh huong toi bien chay
# else: 
#     print('end')
    
#while condition 
    #statement # can cau lenh nhay bien 
# n=10
# i=1
# while i<=10:
#     print(i)
#     break
#     i+=1
# else:
#     print('\n')

#ham 
# def name(a, b):
#     res=a+b
#     return res
# def xinchao(name1):
#     print(name1)
# m, n=map(int, input().split())
# print(name(m, n))
# xinchao('dat')
# if __name__== '__main__':#bat dau chuong trinh chinh
# def solve(name):
#     print(name)
# if __name__=='__main__':
#     s=input()
#     solve(s)    

#output
# using str.format()
# a, b = map(int, input().split())
# print('hai so vua nhap la {}, va {}.'.format(a, b))

# import time
# n = 3
# for i in range(n+1):
#     if(i > 0 and i < n):
#         print(i, end = '>>')
#         time.sleep(1)
#     elif(i >= n):
#         print(i)
#     else:
#         print('start')

# f-strings
    #print variable 
# name = 'nguyen duc dat'
# age = 19
# print(f"my name is {name}, i'm {age} years old")
    #print date
# import datetime
# today = datetime.datetime.today()
# print(f"{today: %b %d, %y}")

#ord(): dua ra ma unicode
#chr(): dua ra ki tu unicode >< ord()

#print without newline using sys module
# import sys
# sys.stdout.write('nguyen duc dat ')
# sys.stdout.write('b22dccn195')

# Python program showing how to use string modulo operator(%)
# print("Geeks : %2d, Portal : %5.2f" % (1, 05.333)) 
# print("Total students : %3d, Boys : %2d" % (240, 120))   # print integer value
# print("%7.3o" % (25))   # print octal value
# print("%10.3E" % (356.08977))   # print exponential value

#Formatting Output using The String Method
# cstr = "i'm a badboy"
# print(cstr.center(20, '#'))#str.center(length, char filled)
# print(cstr.ljust(40, '-'))#str.ljust(length, char filled)
# print(cstr.rjust(40, '-'))#str.rjust(length, char filled)

#using list comprehension
# x = [int(x) for x in input('enter number').split(',')]
# print('list:', x)

#string in py
# truy cap cac ki tu trong xau co the dung chi so am
# s = 'nguyen duc dat'
# print(s[1], s[-1])#print 1st char
# print(s[3 : -1])#print 3rd to (-1)st char
# print(s[::-1])#print reverse s
# s = "".join(reversed(s))#reverse s
# print(s)
#ham join: nhap du lieu tu data nay vao data kia

#update from a string
# list1 = list(s)
# list1[2] = 'p'
# s = ''.join(list1)
# print(s)
# #delete a character
# s = s[0 : 2] + s[3 : ]
# print(s)


# s = "{} {} {}".format('nguyen', 'duc', 'dat')
# print(s)
# s = "{1} {0} {2}".format('nguyen', 'duc', 'dat')
# print(s)
# s = "{x} {y}".format(x = 'dat', y = 'nguyen')
# print(s)
# s = "{0: b}".format(16)
# print(s)
# s = "{0:e}".format(125.8265)
# print(s)




























