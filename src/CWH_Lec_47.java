class Base2 {
    int a;

    public Base2() {
        System.out.println("this is normal constructor or base2 class ");
    }

    public Base2(int a) {
        this.a = a; // method er

        System.out.println("this overload constructor of base2 with the value of a as " + a);
    }

    public int getA() {
        return a;
    }

    public int returnOne() {
        return 1;
    }
}

class Sub3 extends Base2 {
    public Sub3() {
        super(34);
        System.out.println("this is constructor from sub3");
    }
}

public class CWH_Lec_47 {
    public static void main(String[] args) {

        Base2 base2 = new Base2(5);
        System.out.println(base2.getA());
        System.out.println(" ");

        Sub3 sub3 = new Sub3();
    }
}
