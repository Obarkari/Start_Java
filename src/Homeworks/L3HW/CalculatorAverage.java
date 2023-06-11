package Homeworks.L3HW;

import java.util.Scanner;

public class CalculatorAverage {
    public static void main(String[] args) {
        int sum = 0, inputNum;
        int counter;
        float mean;
        Scanner NumScanner = new Scanner(System.in);
        Scanner charScanner = new Scanner(System.in);

        System.out.println("Enter the numbers to calculate average");

        counter = NumScanner.nextInt();

        System.out.println("Please enter " + counter + "numbers");

        for (int x = 1; x <= counter; x++) {
            inputNum = NumScanner.nextInt();
            sum = sum + inputNum;
            System.out.println();
        }
        mean = sum/counter;
        System.out.println("The average is = " + counter + mean);


    }
}
