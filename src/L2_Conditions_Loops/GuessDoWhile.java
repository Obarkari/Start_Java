package L2_Conditions_Loops;

import java.util.Scanner;

public class GuessDoWhile {
    public static void main(String[] args) {

        Scanner myFancyScanner = new Scanner(System.in);

        char ch, answer = 'S';
        System.out.println("Guess the letter in diapason A-Z.");
        System.out.println("Enter it:");
        ch = myFancyScanner.nextLine().charAt(0);

        if (ch != answer) {
            System.out.print ("Sorry, but necessary letter is located closer to ");
            if (ch < answer)
                System.out.println("the end of the alphabet.");
            else System.out.println("the beginning of the alphabet.");
        }
        else System.out.println("You are right.");
    }
}


