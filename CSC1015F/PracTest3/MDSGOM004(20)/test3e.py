#A program to compute the number of letters in lowercase
#Name:Modisane Gomolemo
#Student number:MDSGOM004
#26 April 2024


def count_lowercase(s):
    
    counter = 0#Counter for the number of elements
    for i in s:
        if i.islower():
            counter+=1#Increments when the letter is in lowercase
    return counter


def find_lowercase(s):

    lowercase = []
    for i in s:
        if i.islower():
            lowercase.append(i)#The list appends if a letter is in lower case
    
    return lowercase


def main():
    s = input("Enter a string:\n").strip()
    
    # Count lowercase characters
    lowercase_count = count_lowercase(s)
    print(f"The number of lowercase characters in the string is: {lowercase_count}.")
    
    # Find lowercase characters
    lowercase_list = find_lowercase(s)
    
    # Print lowercase characters as a comma-separated list
    print("List of lowercase characters:")
    if len(s) == 0 or lowercase_count == 0:
        print("[]")
    else:
        print(", ".join(lowercase_list))


if __name__ == "__main__":
    main()
