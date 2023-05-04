package oop;

import java.util.InputMismatchException;
import java.util.Scanner;

public class OOPMain {
    public static void main(String[] args) {

        // Fetch physics class
        Physics physics = new Physics();

        System.out.println("\nPlease select operation to perform:");
        System.out.println("A: Kinetic energy \nB: Potential energy\n");

        System.out.print("Select Operation: ");

        try (Scanner input = new Scanner(System.in)) {
            char operation = input.next().charAt(0);
            System.out.println(operation);

            if (operation == 'A') {
                System.out.print("Enter mass of object (g):");
                float mass = input.nextFloat();

                System.out.print("Enter velocity of object (m/s):");
                float velocity = input.nextFloat();

                physics.getKineticEnergy(mass, velocity);
            } else {
                System.out.println("B SELECTED");

            }

        } catch (InputMismatchException ime) {
            System.out.println("Invalid input.");

        } catch (Exception e) {
            System.out.println("Something went wrong.");
        }

        // Geometry geometry = new Geometry();
        // geometry.accessingPi();

        // Scanner input = new Scanner(System.in);
        // try{
        // float length = input.nextFloat();
        // float breadth = input.nextFloat();

        // System.out.println(geometry.areaOfTriangle(breadth, length));
        // }catch (InputMismatchException ime){
        // System.out.println("Enter a valid number");
        // }catch (Exception e){
        // System.out.println("Something went wrong");
        // }
    }
}
