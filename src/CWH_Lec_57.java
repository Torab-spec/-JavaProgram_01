interface Camera {
    void takeSnap();

    void recordVideo();
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

}

public class CWH_Lec_57 {
    public static void main(String[] args) {

    }
}
