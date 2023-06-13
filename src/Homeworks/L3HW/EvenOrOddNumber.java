package Homeworks.L3HW;

import java.util.Scanner;

public class EvenOrOddNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter any number: ");
        int number = scanner.nextInt();

        System.out.println(number + (number %  2 == 0? " it`s an even number" : " it`s an odd number") );
    }
}
