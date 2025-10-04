public class CWH_Lec_32 {

    static void jokes() {
        System.out.println("Narendra Modi is good man");
    }

    static int logic(int x, int y) {
        int z;
        if (x > y) {
            z = x + y;
        } else {
            z = x * y;
        }
        return z;
    }

    // Example of passByValue or passByReference
    static int passByValue(int p) {
        p = 44;
        return p;
    }

    static int passByRef(int[] arr) {
        arr[0] = 78;
        return arr[0];
    }

//    Method overloading

    static void tim (){
        System.out.println("Hello tim ");
    }
    static int tim (int a){
        System.out.println("Hello tim "+ a);
        return a;
    }

    public static void main(String[] args) {

//        int a = 3;
//        int b = 5;
//        int c = logic(a,b);/
//        System.out.println(c);

//        jokes();

//        passByValue and passByReference

        int p1 = 99;
        System.out.println("printing p1 before calling passByValue " + p1);
        int storingPassByValue = passByValue(p1);
        System.out.println("printing p1 before after calling passByValue " + p1);
        System.out.println("Printing passByValue " + storingPassByValue);

        int[] arr1 = {67, 70, 65, 98, 79};

        System.out.println("printing arr1[0] before calling passByRef " + arr1[0]);
        int storingPassByRef = passByRef(arr1);
        System.out.println("Printing arr1 after calling passByRef " + arr1[0]);
        System.out.println("Printing passByRef " + storingPassByRef);

        // method overloading

        tim();
        tim(1);


    }
}
