
import java.util.Scanner;

public class TableOfN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a positive integer:");
        int n = sc.nextInt(); // You can replace this with any positive integer
        for(int i = 1; i<=10; i++){
            System.out.println(n*i);
        }
    }
}
