# A function to check whether a word matches with the pattern given
# Name:Modisane Gomolemo
# Student number:MDSGOM004
# Date:26 April 2024

def match(pattern,word):
     if pattern == '' and word == '':
          return True                  #If both the strings are empty than the pattern is a match
     elif pattern == '' or word == '':
          return False                # if one of the strings is empty and the other is not than the pattern is not a match
     else:
          if pattern[0] == '?' or pattern[0] == word[0]:#
               return match(pattern[1:],word[1:])
          else:
               return False