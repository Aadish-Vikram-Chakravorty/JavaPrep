
import java.util.Scanner;

public class RectangleArea {
    static int calculateArea(int length, int breadth){
        int area = length*breadth;
        return area;
    }
    
    class Main{
        public static void main(String args[]){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter length of the rectangle");
            int l = sc.nextInt();
            System.out.println("Enter breadth of the rectangle");
            int b = sc.nextInt();
            int area = calculateArea(l, b);
            System.out.println("Area of the rectangle is: " + area); 
        }
    }
}
