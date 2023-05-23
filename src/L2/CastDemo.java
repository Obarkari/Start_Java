package L2;

public class CastDemo {
    public static void main(String[] args) {
        double x, y;
        byte b;
        int i;
        char ch;

        x = 10.0;
        y = 3.0;
        i = (int) (x / y);
        System.out.println("Integer part of result of division x / y: " +i);

        i = 100;
        b = (byte) i;
        System.out.println("Value of b:" + b);

    }
}
