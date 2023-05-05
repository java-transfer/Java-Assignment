package oop;

public class Physics extends Functions {

    void getKineticEnergy(float mass, float velocity) {
        System.out.print(divide(mass, 2) * powTwo(velocity));
        System.out.print(" m/s squared");
    }

}
