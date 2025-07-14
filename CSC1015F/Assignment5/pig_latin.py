# A program that takes a sentence and turns it into pig latin
# Name:Gomolemo Modisane
# Student number:MDSGOM004
# Date:28 March 2024

sentence = input("Enter a sentence:\n").lower()
entencesay = ""#This will store the new pig latin sentence
new_sentence = sentence #This is just a copy of the input that we can manipulate within our for loop 
tracker = 0 # This is our loop breaker to stop after every word is converted
vowels = 'aeiou'
if " " not in sentence: breaker = 0#tHIS IS TO CHECK WHETHER ITSS A SINGLE WORD OR NOT
else: breaker = len(sentence)
  
while tracker <= breaker:
      word = ''
      counter = 0
      if breaker == 0:
           word = new_sentence
      else:
       while new_sentence[counter] != " ":#This while loop isolates the first word of a sentence
            word += new_sentence[counter]
            counter+=1 
      new_word= ""#This will store that pig latin-ed word
      if word[0] in 'aeiou':#Checks the first letter whether it is a vowel
            new_word += word + "way"
      elif word[0] not in vowels  and word[1] not in vowels:#Checks whether the first and second letters are not a vowel
            if len(word)<2 or word[2] in vowels:
             new_word += word[2::]+"a"+word[0:2]+"ay" 
            else:
                 new_word += word[3::]+'a'+word[0:3]+'ay'
      else:
            new_word += word[1::]+"a"+word[0]+"ay"
      breaker -= len(word)# The breaker is is substracted by one word at a time


      entencesay += new_word + " "#Stores the converted word with a space at the end
      new_sentence = new_sentence[len(word)+1::] + " "#this line cuts out the word that has been converted and adds a space at the end to avoid cases where there while loop that isolates words doesnt detect the space which is a loop breaker
      tracker+=1#increments the main loop breaker

print(entencesay[0:-1])#PRints out the new sentence without space at the end


        