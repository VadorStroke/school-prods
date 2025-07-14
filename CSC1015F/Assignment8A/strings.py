
def occurrences(word, words):
    """
    The function accepts a word and a list of words as parameters, it returns a list containing all the matches regardless of case.
    For example, given the word 'at' and the list ['aT', 'fat', 'AT', 'cat', 'at', 'At'], the function will return ['aT', 'AT', 'at', 'At']. 
    """
    lower_list = []
    new_list = []
    for i in range(len(words)):
        lower_list.append(words[i].lower())
        if lower_list[i] == word.lower():
            new_list.append(words[i])
    return new_list
            


# teststrings.py
"""
>>> import strings
>>> strings.occurrences('a', [''])
[]
>>> strings.occurrences('a', ['a'])
['a']
>>> strings.occurrences('a', ['h', 'a'])
['a']
>>> strings.occurrences('a', ['abba', 'A', 'b'])
['A']
>>> strings.occurrences('e', ['eek', 'e', 'E'])
['e', 'E']
>>> strings.occurrences('You', ['did', 'you',  'forget?'])
['you']
>>> strings.occurrences('whAt', ['what', 'Why', 'which', 'wHat', 'WHAT', 'what?', 'when', 'okay', 'no', 'WhAt'])
['what', 'wHat', 'WHAT', 'WhAt']

"""

if __name__ == '__main__':
    import doctest
    doctest.testfile('strings.py', verbose=True)



