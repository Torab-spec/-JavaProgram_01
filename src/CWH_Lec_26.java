public class CWH_Lec_26 {
    public static void main(String[] args) {

        // 1st way to array declaration
        int[] num; // array declaration
        num = new int[5]; // memory allocation
        num[0] = 1; //Initialization
        num[1] = 2;
        num[2] = 3;
        num[3] = 4;
        num[4] = 5;
        System.out.println("This is array num " + num[0]);

        // 2nd way to array declaration

        int[] num1 = new int[5];
        num1[0] = 1; //Initialization
        num1[1] = 2;
        num1[2] = 3;
        num1[3] = 4;
        num1[4] = 5;

        System.out.println("This array num1 " + num1[3]);

        // 3rd way to array declaration

        int [] num2 = {1,2,3,4,5};

        System.out.println("This is array num2 " + num2[4]);


    }
}
