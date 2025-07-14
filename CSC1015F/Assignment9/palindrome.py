#A program that checks whether a sentence or a word is a palindrome
# Name:Modisane Gomolemo
# Student number:MDSGOM004
# Date:25 April 2024

def palindrome(sentence):
    if len(sentence) <= 1:# This is the stop case,if the string is a palindrome it will have length of one or zero
        return True
    else:
       if sentence[0] == sentence[-1]:#if the last and first letter are identical than it can be assumed that the string has the potential to be a palindrome
          return palindrome(sentence[1:-1])#run the function again but the strings first and last letter removed
       else:
          return False#if the first and last letters are not identical than the string is not a palindrome
            
         
        
word = input("Enter a string:\n")
if palindrome(word) == True:
    print("Palindrome!")
else:
    print('Not a palindrome!')
