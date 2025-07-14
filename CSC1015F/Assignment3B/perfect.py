# A program to find whether a number is a perfect number or not"
# By: Modisane Gomolemo
# Student number: MDSGOM004
# Date: 28 February 2024

number = eval(input("Enter a number:\n"))
sum = 0    # This is where the sum of the divisors will be stored

print("The proper divisors of", number, "are:")

#The for loop will go through all the numbers that are proper dividers of a number and print them
for i in range(1,number//2+1):#Halfed the number and added 1 to be more realistic with the range
    if number%i == 0:
        print(i,end = " ")
        sum+=i
  
print("\n")
if sum == number:
    print(number, "is a perfect number.")
    
else:
    print(number, "is not a perfect number.")
            