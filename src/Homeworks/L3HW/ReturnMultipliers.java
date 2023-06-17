package Homeworks.L3HW;

import java.util.Scanner;

public class ReturnMultipliers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        boolean hasMultipliers = findMultipliers(number);

        if (hasMultipliers){
            System.out.printf("The number %d has no multipliers, so it is a prime number.%n", number);
            System.out.println("A prime number (or a prime) is a natural number greater that 1 " +
                    "that is not a product of two smaller natural numbers.");

        }
    }
    private static boolean findMultipliers(int number){
        boolean hasMultipliers = false;

        for (int i = 2; i <= Math.sqrt(number); i++){
            if (number % i ==0){
                int factor = number / i;
                System.out.println(number + " is a product of: " + i + " and " + factor);
                System.out.printf("%d is a product of: %d and %d%n", number, i, factor);
                hasMultipliers = true;
            }
        }
        return hasMultipliers;
    }
}
