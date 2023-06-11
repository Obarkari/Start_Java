package Homeworks.L3HW;

import java.util.Scanner;

public class CalculatorSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number ");
        int a = sc.nextInt();
        System.out.println("Enter the second number ");
        int b = sc.nextInt();
        System.out.println("Enter operation (+)");
        char operation = sc.next().charAt(0);

        if (operation == '+') {
            int result = a + b;
            System.out.println("The sum of the numbers is = " + result);
        }

    }
}
