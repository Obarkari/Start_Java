package L1_JavaPrimitives_Operators;

import java.util.Scanner;

public class Sound {
    public static void main(String[] args) {
        double distance;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter time passed between lightning and sound of it:");

        float time = input.nextFloat();

        distance = time * 335;

        System.out.println("Distance to the place of lightning strike is " + distance + " meters");


    }
}
