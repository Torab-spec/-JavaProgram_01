public class CWH_Lec_25 {
    public static void main(String[] args) {
        // prob 1
        int n = 4;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
        System.out.println(" ");


        // prob 2

        int sum = 0;
        int m = 4;
        int l = 0;

        for (int i = 0; i <= m; i++) {
            sum = sum + (2 * i);
        }
        System.out.println(sum);

        System.out.println(" ");


        // prob 3


    }
}
