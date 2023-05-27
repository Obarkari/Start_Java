package L2;

public class WhileDemo {
    public static void main(String[] args) {
  //      while (condition) {
  //          operator
  //      }

       char ch;
       ch = 'a';

        System.out.println("With while:");

       while (ch <= 'z') {
           System.out.println(ch);
           ch++;
       }
        System.out.println("\n\nWith for:");

       for (ch = 'a'; ch <= 'z'; ch++) {
           System.out.println(ch);
       }

       do {
           System.out.println(ch);
           ch--;
       } while (ch >= 'a');

    }
}
