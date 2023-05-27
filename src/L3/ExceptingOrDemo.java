package L3;

import java.util.Scanner;

public class ExceptingOrDemo {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Is the product on 50% discount?");
        boolean isDiscounted = in.nextBoolean();

        System.out.println("Do you have 50% discound card?");
        boolean hasCard = in.nextBoolean();

        System.out.println("Enter product price:");
        double initialPrice = in.nextDouble();

        if (isDiscounted ^ hasCard) {
            System.out.println("Either coustomer has discount card or the product is discounted itself, not both!");
            initialPrice *= 0.8;
        } else {
            if (isDiscounted) {
                System.out.println("Already discounted.");
                initialPrice /= 2;
            } else {
                System.out.println("Neither");

            }
        }
        System.out.println("the discount has been applied. The final product price is " + initialPrice);

    }
}
