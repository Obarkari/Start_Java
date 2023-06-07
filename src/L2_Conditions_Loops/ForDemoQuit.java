package L2_Conditions_Loops;

import java.io.IOException;

public class ForDemoQuit {
    public static void main(String[] args) throws IOException {
        int i;

        System.out.println("To stop enter q");
        for (i = 0; System.in.read() != 'q'; i++) {
            System.out.println("Run nr." + i);
        }
    }
}
