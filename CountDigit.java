
import java.util.Scanner;

public class CountDigit {

    public static void main(String args[] ){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number");
        int n = sc.nextInt();
        int count = 0;
        for (int i = 0; n > 0; i++) {
            n = n / 10;
            count++;
        }
        System.out.println("Total Digits in: " + n + "is: " + count);
    }
}
