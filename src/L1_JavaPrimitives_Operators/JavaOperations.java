package L1_JavaPrimitives_Operators;

import java.util.Scanner;

public class JavaOperations {
    public static void main(String[] args) {

        int a, b;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter integer value of variable a:");
        a = input.nextInt();
        System.out.println("Enter integer value of variable b:");
        b = input.nextInt();

        double resultPlus = a + b;
        double resultMinus = a - b;
        double resultDivide = a / b;
        double resultMultiply = a * b;
        double resultModule = a % b;


        System.out.println("resultPlus: " + resultPlus );
        System.out.println("resultMinus: " + resultMinus );
        System.out.println("resultDivide: " + resultDivide );
        System.out.println("resultMultiply: " + resultMultiply );
        System.out.println("resultModule: " + resultModule );

        a++;
        System.out.println("a after postfix increment: " + a );
        b--;
        System.out.println("b after postfix decrement: " + b );
        ++a;
        System.out.println("a after postfix increment: " + a );
        --b;
        System.out.println("a after postfix increment: " + b );
    }
}
