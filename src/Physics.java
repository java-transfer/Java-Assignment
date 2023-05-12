package src;

public class Physics extends Functions {

    Float getKineticEnergy(float mass, float velocity) {
        Float result = divide(mass, 2) * powTwo(velocity);
        return result;
    }

    Float getPotentialEnergy(float mass, float height) {
       Float result = multiply(mass, 10) * height;
        return result;
    }

}
