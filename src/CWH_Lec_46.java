
class Base1 {
    int x;

    public Base1() {
        System.out.println("I am Base1 constructor");
    }

    public Base1(int x) {
        System.out.println("I am overloaded constructor with the value of x as :" + x);
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
}

class Sub1 extends Base1 {

    public Sub1() {
//        super(0);
//        super();
        System.out.println("I am Sub1 constructor");
    }

    public Sub1(int x, int y) {
        super(x);
        System.out.println("I am overloaded constructor with derived with value of y as : " + y);
    }
}

class Sub2 extends Base1 {
    public Sub2() {
        System.out.println("I am sub2 constructor");
    }
}

class GrandSub extends Sub1 {
    public GrandSub() {
        System.out.println("I am grand sub");
    }

    public GrandSub(int x, int y, int z) {
        super(x, y);
        System.out.println("I am overloaded constructor of GrandSub with the value of z as : " + z);
    }
}

public class CWH_Lec_46 {
    public static void main(String[] args) {
        System.out.println("Base1 working...");
        Base1 base1 = new Base1();
        System.out.println(" ");

        System.out.println("Sub1 working...");
        Sub1 sub1 = new Sub1(23, 65);
        System.out.println(" ");

        System.out.println("Sub2 working...");
        Sub2 sub2 = new Sub2();
        System.out.println(" ");

        System.out.println("GrandSub working...");
        GrandSub grandSub = new GrandSub(23, 25, 27);
        System.out.println(" ");
    }
}
