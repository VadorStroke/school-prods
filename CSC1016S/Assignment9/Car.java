// Name: Modisnae Gomolemo
// Student number: MDSGOM004
// Date: 18 October 2024;
// Car class;

public class Car extends Vehicle {
    private int passengers;
    private double weight;

    public Car(int numCylinders, String maker, Student owner, int passengers, double carWeight) {
        super(numCylinders, maker, owner);
        this.passengers = passengers;
        this.weight = carWeight;
    }

    public Car(Car C) {
        super(C);// used the copy constructor from vehicle
        this.passengers = C.passengers;
        this.weight = C.weight;
    }

    public String toString() {
        return String.format("The car is a %s-seater weighing %.1f kg", passengers, weight);
    }

}
