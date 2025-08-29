/* *****
 * *   *
 * *   *
 * *   *
 * *****
 */

import java.util.Scanner;

public class HollowRectangle{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any number of rows: ");
		int a = sc.nextInt();
		System.out.print("Enter any number of columns: ");
		int b = sc.nextInt();
		for(int i = 1; i <=a; i++){
			for(int j = 1; i <=b; i++){
				if(i == 1 || i == a || j == 1 || j == b){
					System.out.print("*");
				} 
			}
			System.out.println();
		}
	}
}