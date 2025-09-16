import java.util.Scanner;
public class TargetSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        int n = 0, target;
        System.out.print("Enter the elements of the array:");
        for(int i = 0; i < 5; i++){
            arr[i] = sc.nextInt();
        }
        
        System.out.print("Enter the target sum:");
        target = sc.nextInt();
        System.out.println("Expected Sum is: " + target);
        for(int i = 0; i < 5; i++){
            for(int j = i + 1; j < 5; j++){
                if(arr[i] + arr[j] == target){
                    n++;
                }
            }
        }
        System.out.println("Total number of pairs: " + n);
    }
    // System.out.println();
}
