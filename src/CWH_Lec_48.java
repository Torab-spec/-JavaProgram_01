
class Base3 {


    public Base3() {
        System.out.println("I am Base3 normal constructor");
    }

    public void meth() {
        System.out.println("I am meth from Base3");
    }
}

class Sub4 extends Base3 {
    @Override
    public void meth() {
        System.out.println("I am meth from Base3");
    }
}


public class CWH_Lec_48 {
    public static void main(String[] args) {
        Sub4 sub4 = new Sub4();

        sub4.meth();
        sub4.meth();


    }
}
