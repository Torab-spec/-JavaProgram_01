public class CWH_Lec_09 {
    public static void main(String[] args) {

        int a = (12 - 13 * 2); // the operation execute according presidency
        System.out.println("A :" + a);

        int b = (2 * 13 - 12);  // the operation execute according presidency
        System.out.println("B :" + b);

        int c = (12 * 2 - 12 / 3);// the operation execute according associativity
        System.out.println("C :" + c);

        int d = (12 / 3 - 12 * 2);// the operation execute according associativity
        System.out.println("D :" + d);


    }
}
