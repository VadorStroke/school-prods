# A program to determine the type of animal
# By:Modisane Gomolemo
# Student number:MDSGOM004
# Date:28 February 2024

print("Welcome to the Biology Expert")
print("-----------------------------")
print("Answer the following questions by selecting from among the options.")
print("The skeleton is (internal/external)?")
skeleton = input()

if skeleton == "internal":
    fertilisation = input("The fertilisation of eggs occurs (within the body/outside the body)?\n")
    
    if fertilisation == "within the body":
        production_method = input("Young are produced by (waterproof eggs/live birth)?\n")
        
        if production_method == "waterproof eggs":
            skin_cover = input("The skin is covered by (scales/feathers)?\n")
           
            if skin_cover == "scales":
                print("Type of animal: Reptile")
            else:
                print("Type of animal: Bird")
        else:
            print("Type of animal: Mammal")
    else:
        location = input("It lives (in water/near water)?\n")
        
        if location == "in water":
            print("Type of animal: Fish")
        else:
            print("Type of animal: Amphibian")
else:
    print("Type of animal: Arthropod")
            
                