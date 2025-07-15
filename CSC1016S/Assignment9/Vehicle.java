// Name: Modisnae Gomolemo
// Student number: MDSGOM004
// Date: 18 October 2024;
// Accessories class;

public class Vehicle {
    private int cylinders;
    private String maker;
    private Student owner;

    public Vehicle(int numCylinders, String maker, Student owner) {
        this.cylinders = numCylinders;
        this.maker = maker;
        this.owner = owner;
    }

    public Vehicle(Vehicle v) {// copy constructor
        this.cylinders = v.cylinders;
        this.maker = v.maker;
        this.owner = v.owner;
    }

    public String toString() {
        return String.format("%s, %d cylinders, owned by %s, a %d-year old %s studying %s at %s. %s likes %s.",
                this.maker, this.cylinders,
                owner.getName(), owner.getAge(), owner.getGender(), owner.getProgramOfStudy(),
                owner.getNameOfInstitution(), owner.getName(), owner.getHobbies());
    }
}
