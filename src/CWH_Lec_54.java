
interface P1 {
    public void hellop1();
}

interface P2 {
    public void hellop2();
}


class C1 implements P1, P2 {
    @Override
    public void hellop1() {
        System.out.println("Hello p1...");
    }

    public void hellop2() {
        System.out.println("Hello p2");
    }
}

public class CWH_Lec_54 {
    public static void main(String[] args) {
        C1 c1 = new C1();
        c1.hellop1();
        c1.hellop2();
    }
}
