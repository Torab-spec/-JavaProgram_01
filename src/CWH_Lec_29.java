public class CWH_Lec_29 {
    public static void main(String[] args) {
        // prob 1;

        float[] marks = {25.30f, 20.10f, 45.60f, 9.0f};
        float sum = 0;
        for (int i = 0; i < marks.length; i++) {
            sum = sum + marks[i];

        }
        System.out.println("The total number of marks is : " + sum);
        System.out.println(" ");


        int[] findNum = {25, 20, 45, 9};
        int num = 45;

        for (int i = 0; i < findNum.length; i++) {
            if (num == findNum[i]) {
                System.out.println(true);
                break;
// follow harry code;
            } else {
                System.out.println(false);
            }
        }
    }
}
