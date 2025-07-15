// Name: Modisane Gomolemo
// Student Number: MDSGOM004
// Vector class
// 20 September 2024

public class Vector {
    private double xComponent;
    private double yComponent;

    public Vector(double x, double y) {
        this.xComponent = x;
        this.yComponent = y;
    }

    public double getMagnitude() {
        return Math.sqrt(xComponent * xComponent + yComponent * yComponent);// Returns the square root of the sum of the
                                                                            // squares of the components
    }

    public Vector add(Vector z) {
        Vector v = new Vector(xComponent + z.xComponent, yComponent + z.yComponent);// adds the corresponding angles
                                                                                    // respectively
        return v;
    }

    public Vector multiply(double z) {
        Vector v = new Vector(xComponent * z, yComponent * z);// scales the individual components by a factor
        return v;
    }

    public double dotProduct(Vector z) {
        double val = xComponent * z.xComponent + yComponent * z.yComponent;// returns the dotProduct of two vectors
        return val;
    }

    public String toString() {
        return String.format("v = (%.2f, %.2f)", xComponent, yComponent);// formats the vector in its respective
                                                                         // components
    }

}
