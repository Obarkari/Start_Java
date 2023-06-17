package Homeworks.L3HW;

import java.util.Scanner;

public class LanguageSelection {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Select a language: \n1. Spanish\n2. English\n3. Italy\n4. Norwegian\n5. French\n6. Romanian");

        System.out.print("Enter your choice (1-6): ");
        int choice = scanner.nextInt();

        String greeting = getGreeting(choice);
        System.out.println(greeting);
    }

    private static String getGreeting(int choice) {
        return switch (choice) {
            case 1 -> "Hola! Bienvenido!";
            case 2 -> "Hello! Welcome!";
            case 3 -> "Ciao! Bienvenito!";
            case 4 -> "Hallo! Welkom!";
            case 5 -> "Bonjour! Bienvenue!";
            case 6 -> "Salut! Bine ati venit!";
            default -> "Invalid choice!";
        };
    }
}



