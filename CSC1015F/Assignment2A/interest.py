# 
# Name:Modisane Gomolemo
# Student number:MDSGOM004
# Date: 1 March 2024

loan_amount = eval(input("Enter the loan amount:\n"))
rate = eval(input("Enter the annual interest rate:\n"))
loan_duration = eval(input("Enter the loan duration (years):\n"))

if loan_amount > 0 and rate > 0 and loan_duration > 0:
   #The equation: A = P(1+ry) simplified
    repayment_amount = loan_amount + loan_amount*rate*loan_duration
    
    # prints out variable a to 2 decimal places
    print("The repayment amount is %.2f"%repayment_amount, end = ".")

else:
    print("The values for amount, rate and duration must be greater than zero.")
