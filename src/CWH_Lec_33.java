public class CWH_Lec_33 {


    static int sums(int a, int b) {
        return a + b;
    }

    static int sums(int a, int b, int c) {
        return a + b + c;
    }

    static int sums(int... array) {
        int res = 0;
        for (int j : array) {
            res = res + j;

        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(sums(3, 5));
        System.out.println(sums(3, 5, 6));
//        System.out.println(sums(3,5,6 55)); It will be through a error
        System.out.println(sums(3,5,6, 55));
        System.out.println(sums(3,5,6, 55 ,1,23,7));


    }
}
