# A program that prints out every 7th bumber in the range n + 41 where n is between _6 and 2
# By: Modisane Gomolemo
# Student number : MDSGOM004
# Date: 10 March 2024

number = int(input("Enter a number between -6 and 2:\n"))

if -6 < number < 2:
 for x in range(number, number + 42,7 ):
      if x >= 0 and x < 10:
       print(" ",x , sep = "")
      else:
       print(x)

else :
 print("Invalid input! The value of 'n' should be between -6 and 2.")