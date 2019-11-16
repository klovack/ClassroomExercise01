import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner scannerObj = new Scanner(System.in);

        System.out.print("Input: ");

        int a = scannerObj.nextInt();
        int b = scannerObj.nextInt();

        System.out.println("Minimum: " + (a < b ? a : b));
        System.out.println("Maximum: " + (a > b ? a : b));
    }
}
