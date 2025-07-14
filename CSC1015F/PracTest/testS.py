# A program that counts pairs where the words are in alphabetic order in a sequence
# Name:Modisane Gomolemo
# student number:MDSGOM004

counter = 0
first = input("Enter a digit or string (or 'DONE' to exit):\n")# This is the first input
first = first.lower()# convert to lowercase
next_value= ''
while next_value != 'done':#This will run until
    next_value = input("Enter a digit or string (or 'DONE' to exit):\n")
    next_value = next_value.lower()#This will store the next value as lowercase
    if next_value== "done":#if the value is 'done' then the program breaks out of the loop
        break
    if next_value.isalpha() and first.isalpha():# checks whether the values are alphabets
        if first <= next_value:#checks whether the previous value is is less than the next one in the alphabets
            counter += 1#increments the counter by one
    first = next_value# the first number will now change to the next number

print("Number of pairs of adjacent strings in alphabetical order:", counter , end = ".")