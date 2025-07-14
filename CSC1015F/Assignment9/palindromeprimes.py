#A program that if given a starting value and ending value it will output the palindromic primes within that range
#Name:Modisane Gomolemo
#Student number:MDSGOM004
#Date:28 April 2024
import sys
sys.setrecursionlimit(30000)

def is_prime(num , i = 2):
    """This function checks whether a number is a prime number or not
    returns true if it is and false if its not"""
    if num <= 2:#if number is equal to 2 than it is a prime number
        return num==2
    if i*i > num:# if i(divisor) is equal to the half of the number than we can assume that thre are no other possible divisors
        return True
    if num%i == 0:#if i is a divisor of number than return false as its not a prime number
        return False
    else:
        return is_prime(num,i+1)
   
def primes(start,end):
    """This function uses the is_prime function to check whether a number
     if it is a prime number it store that number in a list """
    if start > end:
        return []
    if is_prime(start):
        return [start] + primes(start+1,end)#if a number is a prime number the start increments by one recurs to check whether the following number is a prime number
    else:
        return primes(start+1, end)

def is_palindrome(number):
    """This function checks whether a number is a palindrome or not
    return tur if it is and false if its not a palindrome"""
    if len(number) <= 1:
        return True #If the length of the number is less than or equals to 1 than the function has sliced all other numbers 
    else:
        if number[0] == number[-1]:#if the first and last values are equal, the function runs again to check whether the other numbers also follow suit
            return is_palindrome(number[1:-1])
        else:
            return False

def palindromes(numbers,index = 0):
    """This function uses the is_palindrome function to check whether a list of prime numbers are palindromes or not
    and if they are it return a string separated by newlines"""
    if len(numbers) == index:#stopcase,if the length of the list is equal to the index than each and every index position has been checked
        return ''
    else:
        if is_palindrome(str(numbers[index])):
            return str(numbers[index]) +'\n' + palindromes(numbers, index +1)#if a number is palindrome the function runs again to check if other primes are palindromes
        else:
            return palindromes(numbers,index+1)
   
    
def main():
    start_point = input("Enter the starting point N:\n")
    end_point = input("Enter the ending point M:\n")

    primevalues = primes(int(start_point), int(end_point))

    palindromevalues = palindromes(primevalues)
    print("The palindromic primes are:")
    print(palindromevalues.strip())#The strip function removees the excess newline that would result from line 43

if __name__ == '__main__':
    main()