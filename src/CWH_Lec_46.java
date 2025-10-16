
class Base1 {
    int x;

    public Base1() {
        System.out.println("I am Base1 constructor");
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
}

class Sub1 extends Base1 {
    int y;

    public Sub1() {
        System.out.println("I am Sub1 constructor");
    }
}

class Sub2 extends Base1{
    public Sub2(){
        System.out.println("I am sub2 constructor");
    }
}

class GrandSub extends Sub1{
    public GrandSub() {
        System.out.println("I am grand sub");
    }
}

public class CWH_Lec_46 {
    public static void main(String[] args) {
        System.out.println("Base1 working...");
        Base1 base1 = new Base1();
        System.out.println("Sub1 working...");
        Sub1 sub1 = new Sub1();
        System.out.println("Sub2 working...");
        Sub2 sub2 = new Sub2();
        System.out.println("GrandSub working...");
        GrandSub grandSub = new GrandSub();
    }
}
