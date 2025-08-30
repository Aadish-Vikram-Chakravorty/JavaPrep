/*
 * * * * * *
 * * * * *
 * * * *
 * * *
 * *
 */

 import java.util.Scanner;

public class InvertedRightTriangle{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any number of rows: ");
		int a = sc.nextInt();
		for(int i = 1; i <=a; i++){
			for(int j = i; j <=1; j--){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}