package L1_JavaPrimitives_Operators;

import java.util.Scanner;

public class GoToWorkOrNot {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Today is weekday? Answer true or false.");
        boolean isWeekday = input.nextBoolean();

        System.out.println("Today is holiday? Answer true or false");
        boolean isHoliday = input.nextBoolean();

        if (isWeekday & isHoliday) System.out.println("It is not weekend bat you can stay home, becous it`s holiday.");
        if (isWeekday | isHoliday) System.out.println("It is weekend or holiday, so stay home.");
        if (isWeekday & isHoliday) System.out.println("It is weekend and not holiday, so go to work.");


    }
}
