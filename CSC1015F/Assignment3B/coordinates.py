# A program to determine whether a set of six numbers are a pair of GPS coordinates
# By: Modisane Gomolemo
# Student number: MDSGOM004
# Date: 28 February 2024

latitude_degrees = eval(input("Enter first number:\n"))
latitude_minutes = eval(input("Enter second number:\n"))
latitude_seconds = eval(input("Enter third number:\n"))

longitude_degrees = eval(input("Enter fourth number:\n"))
longitude_minutes = eval(input("Enter fifth number:\n"))
longitude_seconds = eval(input("Enter sixth number:\n"))

#This is used to count the number of correct values
counter = 0

if latitude_degrees >= -90 and latitude_degrees <= 90:
    counter+=1

if latitude_minutes >= 0 and latitude_minutes <= 59:
    counter+=1

if latitude_seconds >= 0 and latitude_seconds <= 59:
    counter+=1

if longitude_degrees >= -180 and longitude_degrees <= 180:
    counter+=1
        
if longitude_minutes >= 0 and longitude_minutes <= 59:
    counter+=1
    
if longitude_seconds >= 0 and longitude_seconds <= 59:
    counter+=1

# if all six numbers are true than the numbers are coordinates
if counter == 6:
    print("WOW! Looks like geographic coordinates!")
else:
    print("Hmmm ... looks like 6 random numbers.")



