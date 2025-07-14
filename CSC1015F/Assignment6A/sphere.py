# A program to calculate the volume of a sphere
# Name:Modisane Gomolemo
# Student number:MDSGOM004
# Date:05 April 2024

from math import pi, pow

def volume(radius):#This function calculates the vloume of a sphere
    sphere_volume = ((4*pi)*pow(radius,3))/3# This is the formula to calculate the volume of a sphere
    return sphere_volume

def main():
    sphere_radius = float(input("Enter the radius of the sphere:\n"))
    
    if sphere_radius >= 0:
        volume_value = round(volume(sphere_radius),5)# Round the volume to the nearest 10 
        print("The volume is %.2f." % volume_value)#Displays only to decimal poins
        
    else:
        print("The radius must not be a negative value.")#This is if the radius is less than zero

if __name__ == '__main__':
    main()