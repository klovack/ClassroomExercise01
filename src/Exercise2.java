import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input: ");

        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        System.out.println("Output: " + (a * b * c));
    }
}
