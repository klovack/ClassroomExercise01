import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input: ");

        int a = input.nextInt();
        int b = input.nextInt();

        System.out.print("Output: ");

        // Iterate from b to a with (b-1) + (b-2) + ... + (a+1)
        for (int i = (b - 1); i > a ; i--) {
            System.out.print(i + " ");
        }
    }
}
