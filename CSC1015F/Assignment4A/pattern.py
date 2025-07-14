# A program to print out a triangle formed with # and ^
# Name: Gomolemo Modisane
# Student number: MDSGOM004
# 15 May 2024

n = int(input("Enter an integer value:\n"))

if n>0:
 
 for i in range(1, n+1):
    if i % 2 != 0:#If i is odd print the character "^"
        print("^"*i)
    else:#else print the # character
        print("#"*i)
else:
 print("The value must be 1 or more.")