interface Bicycle {
    int a = 4;  // You can create property / variable in interface;

   /* int a;  // Not allowed
    a = 4;*/   // But you cant modify or re-assigned  property/variable;

    public void applyBreak();

    public void applySpeedUp();
}

abstract class Cycle {
    int x = 45;

    abstract void cycleCompany();

}

class Avon extends Cycle implements Bicycle {
    public void blowHorn() {
        System.out.println("Horn is blowing...");
    }

    public void applyBreak() {
        System.out.println("Break is applying...");
    }

    public void applySpeedUp() {
        System.out.println("applying speed up...");
    }


    public void cycleCompany() {
        System.out.println("The cycle company name is Avon");
    }
}

public class CWH_Lec_55 {
    public static void main(String[] args) {
        Avon avon = new Avon();
        avon.blowHorn();
        avon.applyBreak();
        avon.applySpeedUp();
        avon.cycleCompany();

//        avon.a = 77; // not allowed
        int interfaceInt = avon.a;

        avon.x = 98; // allowed
        int classInt = avon.x;
        System.out.println("this is classes int " + classInt);

        System.out.println("this is interface int " + interfaceInt);

    }
}
