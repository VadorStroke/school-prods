// Name: Modisnae Gomolemo
// Student number: MDSGOM004
// Date: 18 October 2024;
// Question 3 class that takes inputs, stores it and prints it;

import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {

        String vehicle = "";
        String nameOfOwner = "";
        String gender = "";
        String program = "";
        String nameOfInst = "";
        String hobbies = "";
        int age = 0;
        int cylinders = 0;
        double weight = 0;
        int capacity;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the vehicle manufacturer:");
        vehicle = input.nextLine();
        System.out.println("Enter the name of the vehicle owner:");
        nameOfOwner = input.nextLine();
        System.out.println("Enter the owner's gender:");
        gender = input.nextLine();
        System.out.println("Enter the owner's programme of study:");
        program = input.nextLine();
        System.out.println("Enter the owner's Institution name:");
        nameOfInst = input.nextLine();
        System.out.println("Enter the owner's hobbies:");
        hobbies = input.nextLine();
        System.out.println("Enter the owner's age:");
        age = input.nextInt();
        System.out.println("Enter the number of cylinders in the engine:");
        cylinders = input.nextInt();
        System.out.println("Enter the car seating capacity:");
        capacity = input.nextInt();
        System.out.println("Enter the weight of the car:");
        weight = input.nextDouble();

        Student student = new Student(nameOfOwner, age, gender, nameOfInst, hobbies, 1, program);
        Car car = new Car(cylinders, vehicle, student, capacity, weight);
        Vehicle vehicles = new Vehicle(cylinders, vehicle, student);

        System.out.println(vehicles);
        System.out.println(car);

        input.close();
    }
}
