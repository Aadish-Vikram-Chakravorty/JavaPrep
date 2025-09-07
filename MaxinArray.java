public class MaxinArray {
    public static void main(String[] args) {
        int arr[] = {123, 45, 8, 90, 12, 69, 101};
        int max = arr[0];
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println("Max = " + max);
    }
}
