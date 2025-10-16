class Base {
    int x;
    int a = 333;
    int b ;

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getX() {
        return x;
    }

    public void printMe() {
        System.out.println("I am Constructor");
    }
}

class Sub extends Base {
    int y;
    int z;

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}

public class CWH_Lec_45 {
    public static void main(String[] args) {

        Base base = new Base();

        base.setX(45);
        System.out.println(base.getX());
        base.printMe();
        System.out.println(base.a);
        base.setB(34);
        System.out.println(base.getB());


//        Derived Class
        Sub sub = new Sub();
        sub.setX(1);
        sub.setY(32);
        sub.setZ(31);


        System.out.println(sub.getX());
        System.out.println(sub.getY());
        System.out.println(sub.getZ());
        sub.printMe();
        System.out.println(sub.a);
        System.out.println(sub.getB());  // it will return 0 || cz the value of b is not set yet
    }
}
