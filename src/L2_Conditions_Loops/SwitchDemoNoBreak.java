package L2_Conditions_Loops;

public class SwitchDemoNoBreak {
    public static void main(String[] args) {
 //     switch (expression) {
 //         case constant1:
 //             sequence of operators
 //                 break;
 //         case constant2:
 //             sequence of operators
 //             break;
 //         case constant:
 //             sequence of operators
 //             break;
 //         default:
 //             sequence of operators
 //     }

        int i;
        for (i = 1; i < 10; i++) {
            switch (i) {
                case 0:
                    System.out.println("i is equal to 0");

                case 1:
                    System.out.println("i is equal to 1");

                case 2:
                    System.out.println("i is equal to 2");

                case 3:
                    System.out.println("i is equal to 3");

                case 4:
                    System.out.println("i is equal to 4");

                default:
                    System.out.println("i is equal or greated that 5");

            }
        }
    }
}
