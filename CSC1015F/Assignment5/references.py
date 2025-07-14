#A program that reformats a sentence
#Name:Modisane Gomolemo
#Student number:MDSGOM004
#Date:29 March 2024

reference = input("Enter the reference:\n")

authors = reference[:reference.find(")"):1].title()#converts the first letters of the names of the authors into uppercase
title = reference[reference.find(")")::]#eliminating the already converted sentence
title_lwer = title[2:title.find(","):1].capitalize()#Capitalising the first letter of the second sentence and leaving the rest of the sentence as lowercase
information = title[title.find(",")::]#Isolates the remainder of the information

print("Reformatted reference:")
print(authors+") "+title_lwer+information)#printing out the final changes of references
