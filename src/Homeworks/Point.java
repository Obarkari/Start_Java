package Homeworks;

public class Point {
    public static void main(String[] args)
       throws java.io.IOException {

        char ch;
        int spaces = 5;

        System.out.println("Enter a point to stop!");

        do {
            ch = (char) System.in.read();
            if (ch == ' ') spaces++;
                }
        while (ch != '.');

        System.out.println("Spaces: " + spaces);
    }
}
