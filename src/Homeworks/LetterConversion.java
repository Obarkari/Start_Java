package Homeworks;

public class LetterConversion {
    public static void main(String[] args)
        throws java.io.IOException {
        char ch;
        int replacement = 0;

        System.out.println("Enter a point to stop.");

        do {
            ch = (char) System.in.read();
            if (ch >= 'a' & ch <= 'z') {
                ch -=32;
                replacement++;
                System.out.println(ch);
            }
        } while (ch != '.');
        System.out.println("Letter conversion: " + replacement);

    }
}
