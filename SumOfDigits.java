
import java.util.Scanner;

public class SumOfDigits {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 0; n > 0; i++) {
            sum = sum + n%10;
            n = n / 10;
        }
        System.out.println("Sum of Digits: " + n + "is: " + sum);
    }
}
