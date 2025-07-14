# Program to check the validity of time entered
# Name: Modisane Gomolemo
# Student number: MDSGOM004
# Date: 26 February 2024

hours = eval(input("Enter the hours:\n"))
minutes = eval(input("Enter the minutes:\n"))
seconds = eval(input("Enter the seconds:\n"))

negcheck = hours*minutes*seconds

#Tis variable will be used to count how many statements hold true
counter = 0

#This checks whether there is a negative number in the input given
if negcheck >= 0:
  counter += 1

if hours <= 23:
    counter += 1  # Counter increments when the bool expression is true
if minutes <= 59:
    counter += 1
if seconds <= 59:
    counter += 1
    
# If all bool expressions are true than the time entered was valid
if counter == 4:
    print("Your time is valid.")

else :
  print("Your time is invalid.")
