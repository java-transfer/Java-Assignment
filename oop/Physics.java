package oop;

public class Physics extends Functions {

    void getKineticEnergy(float mass, float velocity) {
        System.out.print(divide(mass, 2) * powTwo(velocity));
        System.out.print(" m/s squared");
    }
    void getPotentialEnergy(float mass, float height) {
        System.out.print(multiply(mass, 10) * height);
        System.out.print( " Joules");
    }

}
