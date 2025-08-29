
import java.util.Scanner;

public class SumOfNnum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n; // Example value for n
        System.out.println("Enter a positive integer:");
        n = sc.nextInt(); // You can replace this with any positive integer
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        System.out.println("Sum of first " + n + " natural numbers is: " + sum);
    }
}
