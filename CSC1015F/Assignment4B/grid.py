#A program that prints out n to n+ 41 as 6 rows of 7 numbers
# Name: Modisane Gomolemo
# Student number: MDSGOM004
# Date 10 March 2024

n = int(input("Enter a number between -6 and 2:\n"))
space = 7

if -6< n < 2:
 #creation of rows
 for k in range(n , n + 42):
     #Case where [d] is a "-" or aother digit
     if k < 0 or k > 9:
        #To make each first digit of each row start at the beginning of the row
        if k == n or k == n + 7 or k == n + 14 or k == n + 21 or k == n + 28 or k == n + 35:
         print(k , end = "")
        else:# This is for the midde values
         print(" ",k, sep = "", end = "")
     else:
        #To make each first digit of each row start at the beginning of the row
        if k == n or k == n + 7 or k == n + 14 or k == n + 21 or k == n + 28 or k == n + 35:
         print(" ", k , sep ="",end =  "")
        else:
         print(" ", k  , end = "")
     #This if statement creates a newline after the last value
     if k == n + space-1:  
         space+=7
         print() 

else:
 print("Invalid input! The value of 'n' should be between -6 and 2.")
   
   