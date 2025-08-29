import java.util.Scanner;

public class ReverseDigits{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any number: ");
		int n = sc.nextInt();
		int newnum = 0;
		for(int i = 0; n>0; i++ ){
			newnum = newnum*10 + n % 10;
			n = n / 10;
		}
		System.out.println("New number is: " + newnum);
	}
}