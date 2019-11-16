import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input: ");

        int a = input.nextInt();
        int b = input.nextInt();

        int sum = 0;

        for (int i = a; i <= b; i++) {
            sum += i;
        }

        // Alternative
//        while (a <= b) {
//            // a to b
//            sum = sum + a;
//            a++;
//
//            // b to a
////            sum = sum + b;
////            b--;
//        }

        System.out.println("Output: " + sum);
    }
}
