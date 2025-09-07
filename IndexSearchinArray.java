public class IndexSearchinArray {
    public static void main(String[] args) {
        int arr[] = {23, 45, 8, 90, 12, 69, 101};
        int x = 79;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == x){
                System.out.println(i);
                // break;
            }
        }
        System.out.println("Not Found");
    }
}
