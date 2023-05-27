package L1_JavaPrimitives_Operators;

import java.util.Scanner;

public class GoToWorkOrNotWithSwitch {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("What day is today?");
        String weekday = input.nextLine();

        switch (weekday) {
            case "Monday":
            case "Tuesday":
            case "Wednesday":
            case "Thursday":
            case "Friday":
                System.out.println("Working day!");
                break;
            case "Saturday":
            case "Sanday":
                System.out.println("Weekend!");
                break;
            default:
                System.out.println("Invalid input.");
        }


    }
}
