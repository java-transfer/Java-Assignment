package oop;

public class Physics extends Functions {

    void getKineticEnergy(float mass, float velocity) {
        System.out.print(divide(mass, 2) * powTwo(velocity));
        System.out.print(" Joules");
    }

    // float areaOfSquare(float length) {
    // return powTwo(length);
    // }

    // float areaOfTriangle(float breadth, float length) {
    // return divide(1, 2) * multiply(breadth, length);
    // }

    // float areaOfRectangle(float length, float breadth) {
    // return multiply(length, breadth);
    // }
}
