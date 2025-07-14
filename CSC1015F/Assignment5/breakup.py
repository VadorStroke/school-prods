# A program that reformats a sentence
# Name:Modisane Gomolemo
# Student number:MDSGOM004
# Date:29 March 2024


sentence = input("Enter a sentence:\n")
new_sentence = ""

for i in sentence:
    if i != " ":
       new_sentence += i
    else :
       new_sentence += ", "

print("The word list: " + new_sentence.lower() + ".")