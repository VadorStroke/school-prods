# A function to check whether a word matches perfectly with the pattern given
# Name: Modisane Gomolemo
# Student number: MDSGOM004
# Date: 26 April 2024


def match(pattern, word):
    if pattern == '' and word == '':#Stop case,if the pattern and words are empty at the same time than they had the same length
        return True
    elif pattern == '*' and word == '':#stop case 2, if the pattern has a '*' and the word is empty than it means the wildcard has zero letters
        return True
    elif pattern == '' or word == '':# stop case 3, if the one of the strings is empty than it means the strings where not of equal length
        return False
    else:
        if pattern[0] == '?' or pattern[0] == word[0]:#if the first letter of the pattern the first letter of the word will be 'sliced'
            return match(pattern[1:],word[1:])#recur but with the first letter of the word and the pattern sliced
        elif pattern[0] == '*':
            return match(pattern[1:], word) or match(pattern, word[1:])
           # return match(pattern[1:],word[word.find(pattern[1:]):])#used the find function to find the remainder of the pattern after the '*' so that the word can be sliced from after the 'x' would be located
        else:
            return False# returns falls if the letters are not equal and the patterns first letter is not a '*'
