#A program to store, retrieve or print the contacts stored in a file
# Modisane Gomolemo 
#MDSGOM004
#12 May 2024

def path_exists(file_path):
    try:
        file = open(file_path, 'r')
        return True
    except FileNotFoundError:
        file = open(file_path, 'w')#if the file does not exist a new file is created
        file.close()
        return False
        
    
def add_contact(file_path,name,phone,email):
    myfile = open(file_path, 'r')
    new = myfile.read()
    if name in new: print("Contact already exists.")#if the name of the contact can be found in the file than the contact is not added
    else:
      file = open(file_path, 'a')
      print(name, phone, email , sep = ',' ,file = file)#A line in a file is created with commas searating the different information
      file.close()
      print("Contact added successfully.")
    print()
    return ''

def custom_sort(contacts):
    """This function just sorts a list in alphabetical order"""
    
    contacts.sort()
    return contacts

name = []

def queryType(file_path,query):
    """Function checks the category at which the query falls into
    if its a name it will return a list of names only and if its an email it will return a list of emails"""
    contacts  = open(file_path, 'r')
    list_of_query = []
    pos = 0
    if '@' in query:#means its an email
        pos = 2
    elif query.isdigit():#Means its a number
        pos = 1
    else:
        pass#Else its a name

    for i in contacts:
        
        names = i[:i.find(',')]#Isolates th name only
        name.append(names)#Since in this case we are assuming the user is going to be searching for a name we will appedn this to the name list
        new = i.replace(' ', '')#Joins the words together removing spaces
        new = new.replace(',', ' ')#Removes the , and adds spaces
        list_of_query.append(new.rsplit()[pos])#Splits each element in a line separated by a space into a list
    contacts.close()
    return list_of_query

def search_contact(name, query):
    query = query.split()[0]#Again if the query is a name with surname we just take his name for efficiency
    list_of_query = queryType(name, query)
    sorted_query = custom_sort(list_of_query)
    for i in sorted_query:#This is incases where the surname is searched, we first check what name ties this surname than we take it and make it our query
        if query in i:
           query = i.split()[0]
    
    ans =  ternary_search(sorted_query, query , 0 , len(sorted_query)-1)
    if ans != -1:#If its not minus one than a position was found
        return list_found_contact(ans, name)
    else:
        return 'No contact found.\n'
    

def ternary_search(query_list, query , start, end):
    if query_list[0] == query:
        return 0
    if start > end: return -1
    if end >= 1:#Unnessesary but was a way to make the function more understandable
        third = start + (end - start)//3#This is the third of the information
        two_third = end - (end - start)//3#This is the whole information minues a third of it
        if query in query_list[third]:#stop case 1, the query is equal to the first midpoint
            return third
        if query in query_list[two_third]:#stop case 2, the query is equal to the second midpoint
            return two_third
        if query < query_list[third]:
            return ternary_search(query_list, query , start , third-1)#If the query is in the first third the first midpoint is going to be the end
        elif query_list[third] < query < query_list[two_third] :#If the query is in the middle of the midpoints the first midpoint is the start and the second midpoind is the end
            return ternary_search(query_list, query, third+1 , two_third-1)
        else:#The query is located in the third half of the information
            return ternary_search(query_list, query , two_third+1 , end)


def read_contact(file_path):
    myFile = open(file_path, 'r')
    new = myFile.readlines()
    myFile.close()
    return new

def read_contacts(file_path):
    myFile = open(file_path, 'r')
    lines = myFile.read().split('\n')
    values = []

    for i in lines:
        values.append(i.split(','))
    return values


def list_contacts(file_path):
    contacts = read_contact(file_path)
    contacts.sort()
    print("============================================================")
    print('| Name                 | Phone           | Email                     |')
    print("============================================================")
    for i in contacts:
        name = i[:i.find(',')]#isolates name
        i = i[i.find(',')+1:]#remove name
        phone = i[:i.find(',')]#isolates phone number
        i = i[i.find(',')+1:]#removes phone number
        email = i.replace('\n','')#remove the newline 
        print('| {0:<21}| {1:<16}| {2:<26}|'.format(name,phone,email))
        print('------------------------------------------------------------')
    print()
    return ''

def list_found_contact(pos,file_path):
    contact = read_contact(file_path)
    contact.sort()
    print("Found contact(s):")
    print("============================================================")
    print('| Name                 | Phone           | Email                     |')
    print("============================================================")
    contact_line = contact[pos]
    name = contact_line[:contact_line.find(",")]#isolate name
    contact_line = contact_line[contact_line.find(',')+1:]#removes name
    phone = contact_line[:contact_line.find(",")]#isolates phone number
    contact_line = contact_line[contact_line.find(',')+1:]#removes phone number
    email = contact_line.replace('\n', '')#isolates email and removes the newline character
    print('| {0:<21}| {1:<16}| {2:<26}|'.format(name,phone,email))
    print('------------------------------------------------------------')
    return ''

def wildcard(pattern, word):
    if pattern == '' and word == '':#Stop case,if the pattern and words are empty at the same time than they had the same length
        return True
    elif pattern == '*' and word == '':#stop case 2, if the pattern has a '*' and the word is empty than it means the wildcard has zero letters
        return True
    elif pattern == '' or word == '':# stop case 3, if the one of the strings is empty than it means the strings where not of equal length
        return False
    else:
        if pattern[0] == '?' or pattern[0] == word[0]:#if the first letter of the pattern the first letter of the word will be 'sliced'
            return wildcard(pattern[1:],word[1:])#recur but with the first letter of the word and the pattern sliced
        elif pattern[0] == '*':
            return wildcard(pattern[1:], word) or wildcard(pattern, word[1:])
           
        else:
            return False# returns falls if the letters are not equal and the patterns first letter is not a '*'

name_of_file_txt = ''
def main():
    run = False
    name_of_file = input('Enter the name for the contacts file:\n')
    
    name_of_file_txt = name_of_file+'.txt'
    if path_exists(name_of_file_txt) == False:
        print("Contacts file '{0}' created.".format(name_of_file_txt))
    print()

    while not run:#Will run until the user inputs 4 which will make run true
        print("1. Add Contact")
        print('2. Search Contact')
        print('3. List Contacts')
        print('4. Exit')
        choice = int(input("Enter your choice: "))

        if choice == 1:
            name_of_contact = input("Enter name: ") 
            phone_number = input("Enter phone number: ")
            email_address = input("Enter email: ")
            add_contact(name_of_file_txt,name_of_contact,phone_number,email_address)
        elif choice == 2:
            to_search = input("Enter first name, last name, phone number, or email to search:\n").split()[0]
            if to_search == '*':
                print('Found contact(s):')
                list_contacts(name_of_file_txt)
            else:
               print(search_contact(name_of_file_txt,to_search))
            
        elif choice == 3:
             print("\nList of contacts:")
             list_contacts(name_of_file_txt)
        elif choice == 4:
              print("Exiting program.")
              run = True

if __name__ == '__main__':
    main()