"""
>>> import palindrome
>>> palindrome.is_palindrome('')
True
>>> palindrome.is_palindrome('a')
True
>>> palindrome.is_palindrome('race')
False
>>> palindrome.is_palindrome('racecar')
True
>>> palindrome.is_palindrome('aba')
True

"""
import doctest
doctest.testmod(verbose=True)