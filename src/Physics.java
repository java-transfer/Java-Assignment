package src;

public class Physics extends Functions {

    Float getKineticEnergy(float mass, float velocity) {
        Float result = divide(mass, 2) * powTwo(velocity);
        return result;
    }

    void getPotentialEnergy(float mass, float height) {
        System.out.print(multiply(mass, 10) * height);
        System.out.print(" Joules");
    }

}
