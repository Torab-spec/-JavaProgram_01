interface Camera {
    void takeSnap();

    void recordVideo();

    private void recordThing() {
        System.out.println("Record using vive phone");
    }

    default void record4kVideo() {
        System.out.println("4k video recording...");
    }
}

interface Wifi {
    String[] getNetwork();

    void connectNetwork(String getNetwork);
}

class cellPhone {

    void callNumber(int number) {
        System.out.println("calling " + number);
    }

    void pickCall() {
        System.out.println("Picking !");
    }
}


class MYSmartPhone extends cellPhone implements Camera, Wifi {

    public void takeSnap() {
        System.out.println("Snap taking...");
    }

    public void recordVideo() {
        System.out.println("Video record");
    }

    public String[] getNetwork() {
        System.out.println("Getting list of network ");
//        return new String[]{"Rina", "Mina", "Tina", "Bina"}; // Both are same
        String[] networkList = {"Rina", "Mina", "Tina", "Bina"};
        return networkList;
    }

    public void connectNetwork(String network) {
        System.out.println("connecting to " + network);
    }

//    @Override
//    public void record4kVideo() {
//
//        System.out.println("Record 4k video by Bina");   // if the default getting override then the private method can't invoke
//
//    }

}

public class CWH_Lec_57 {
    public static void main(String[] args) {

        MYSmartPhone mySmartPhone = new MYSmartPhone();
        mySmartPhone.takeSnap();
        mySmartPhone.recordVideo();
        String[] arr = mySmartPhone.getNetwork();
        mySmartPhone.connectNetwork("Vodafone");
        mySmartPhone.connectNetwork("7584095614");
        mySmartPhone.pickCall();

        //mySmartPhone.recordThing; // no allowed || we cant call directly private method of interface
        mySmartPhone.record4kVideo();

    }
}
