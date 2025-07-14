# A program that will print a sequence of 7 numbers, starting from that value
# By: Gomolemo Modisane
# Student number: MDSGOM004
# 13 March 2024


number = int(input("Enter a number between -6 and 93:\n"))

if -6 < number < 93 :
    #Printing the first values of the row
    if number < 0 or number > 9:
        print(number , end = "" )
    else:
        print(" ",number , sep = "", end = "")
    
    # Printing of the remaining values in a row
    for i in range(number+1, number + 7):
        if i < 0 or i > 9:
            print(" ", i,sep='', end = "")
        else:
            print(" ",i, end = "")
 
else:# This is incase the user inputs invalid values that are not within our range
    print("Invalid input! The value of 'n' should be between -6 and 93.")