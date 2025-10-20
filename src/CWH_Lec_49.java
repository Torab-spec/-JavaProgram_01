
class SupPhone {
    public void alarm() {
        System.out.println("Alarm is ringing from SupPhone...");
    }

    public void call() {
        System.out.println("Calling from SupPhone...");
    }

}

class SmartPhone extends SupPhone {
    @Override
    public void call() {
        System.out.println("Calling from SmartPhone...");
    }

    public void music() {
        System.out.println("Music playing from SmartPhone...");
    }

}


public class CWH_Lec_49 {
    public static void main(String[] args) {

        SupPhone supPhone = new SupPhone();

//        supPhone.alarm();
//        supPhone.call();
//        System.out.println(" ");

        SmartPhone smartPhone = new SmartPhone();

//        smartPhone.alarm();
//        smartPhone.call();
//        smartPhone.music();

        SupPhone dmd = new SmartPhone();

        dmd.alarm();
        dmd.call();
//        dmd.music(); // Not Accepted


    }
}
