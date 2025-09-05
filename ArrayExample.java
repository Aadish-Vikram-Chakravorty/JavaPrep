public class ArrayExample {
    void demoArry(){
        int ages[] = new int[4];
        float wieghts[] = new float[3];
        String names[] = new String[4];

        ages[0] = 10;
        ages[1] = 20;
        ages[2] = 30;
        ages[3] = 40;
        // ages[4] = 50; // ArrayIndexOutOfBoundsException
        // System.out.println("ages[0] = " + ages[0]);
        // System.out.println("ages[1] = " + ages[1]);
        // System.out.println("ages[2] = " + ages[2]);
        // System.out.println("ages[3] = " + ages[3]);

        for(int i = 0; i < 4; i++){
            System.out.println(ages[i]);
        }
        //System.out.println("ages[4] = " + ages[4]); // ArrayIndexOutOfBoundsException

        wieghts[0] = 45.5f;
        wieghts[1] = 55.5f;
        wieghts[2] = 65.5f;
        System.out.println("wieghts[0] = " + wieghts[0]);
        System.out.println("wieghts[1] = " + wieghts[1]);
        System.out.println("wieghts[2] = " + wieghts[2]);

    }

    public static void main(String[] args) {
        ArrayExample obj = new ArrayExample();
        obj.demoArry();
    }
    
}
