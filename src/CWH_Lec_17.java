public class CWH_Lec_17 {
    public static void main(String[] args) {
        int a = 5;
        int b = 5;
        int a1 = 7;
        int b1 = 6;
        boolean c = true;
        boolean d = true;
        boolean e = false;
        boolean f = false;


        System.out.println("\nWorking with && operator");
        if (c && d) {
            System.out.println("yes");
        } else {
            System.out.println("NO");
        }

        if (e && f) {
            System.out.println("yes");
        } else {
            System.out.println("No");
        }

        if ((a == b) && (a1 == b1)) {
            System.out.println("both are true");
        } else {
            System.out.println("Both are false");
        }

        System.out.println("\nWorking with OR operator");

        boolean x = true;
        boolean y = true;
        boolean z = false;
        boolean w = false;

        if (x || y) {
            System.out.println("The or condition is true");
        } else {
            System.out.println("The or condition is not true");
        }

        if (z || w) {
            System.out.println("The or condition is true");
        } else {
            System.out.println("The or condition is false");
        }
        if (x || z) {
            System.out.println("The or condition is true");
        } else {
            System.out.println("The or condition is false");
        }

        System.out.println("\nWorking with NOT operator");

        boolean p = true;
        boolean q = false;
        System.out.println("NOT(p) : " + !p);
        System.out.println("NOT(q) : " + !q);

    }
}
