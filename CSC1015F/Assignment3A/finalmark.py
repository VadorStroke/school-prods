# A program that calculates and prints out the final mark followed by the classification.
# Name:Modisane Gomolemo
# Student number: MDSGOM004
# Date:08 March 2024

prac_marks = int(input("Enter the mark for practical work:\n"))
test_marks = int(input("Enter the mark for class tests:\n"))
exam_marks = int(input("Enter the mark for the final exam:\n"))

if prac_marks >= 0 and prac_marks <= 100 and test_marks >= 0 and test_marks <= 100 and exam_marks >= 0 and exam_marks <= 100: 
 final_mark = prac_marks*0.3 + test_marks*0.2 + exam_marks*0.5

 if final_mark >= 75 and final_mark <=100:
    print("The final mark is", final_mark, end = ".")
    print("\nThis mark is graded as a 1st.")

 elif final_mark >= 60 and final_mark < 75:
    print("The final mark is", final_mark, end = ".")
    print("\nThis mark is graded as a 2nd.")
  
 elif final_mark >= 50 and final_mark < 60:  
    print("The final mark is", final_mark, end = ".")
    print("\nThis mark is graded as a 3rd.")    
    
 else:
   print("The final mark is", final_mark, end = ".")
   print("\nThis mark is graded as a Fail.")

else:
 print("Marks must be in the range 0 to 100.")