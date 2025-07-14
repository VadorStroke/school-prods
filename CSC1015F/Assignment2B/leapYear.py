# A program to determine whether a year is a leap year or not
# Name: Gomolemo Modisane
# Student number: MDSGOM004
# Date: 27 February 2024

year = eval(input("Enter a year:\n"))

# A leap year is any number divisible by 400 or any number that is divisible by 4 and not divisible by 100 
if year%400 == 0 or year%4 == 0 and year%100 != 0:
    print(year, "is a leap year.")

else :
    print(year, "is not a leap year.")