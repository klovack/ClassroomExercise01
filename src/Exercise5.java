import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        while(true) {
            Scanner input = new Scanner(System.in);

            System.out.print("Input: ");

            int a = input.nextInt();
            int b = input.nextInt();

            if (a < b) {
                System.out.println("a is less than b");
            } else if (a == b) {
                System.out.println("a is equal to b");
            } else if (a > b) {
                System.out.println("a is greater than b");
            }
        }
    }
}
