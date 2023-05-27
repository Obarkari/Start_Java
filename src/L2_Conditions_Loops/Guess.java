package L2_Conditions_Loops;

import java.util.Scanner;

public class Guess {
    public static void main(String[] args) {
  //      if (condition) {
  //          sequence of operators
 //       } else {
 //           sequence of operators
 //       }

        Scanner myFancyScanner = new Scanner(System.in);

        char ch, answer = 'S';
        System.out.println("Guess the letter in diapason A-Z.");
        System.out.println("Enter it:");
        ch = myFancyScanner.nextLine().charAt(0);

        if (ch == answer) System.out.println("You are right!");
        else System.out.println("Sorry, you are wrong. Try next time!");

    }
}


