public class Add2Num {
    static int add(int a, int b){
        int sum = a+b;
        return sum;
    }

    
    class Main{
        public static void main(String args[]){
            int x=5;
            int y=10;
            int ans = add(x,y);
            System.out.println(ans);
        }
    }
}
