interface MyCamera {
    void takeSnap();

    void recordVideo();
}

interface MyRadio {
    void playRadio();

    void stopRadio();
}

interface MyGps {
    void liveLocation();

    void currentLocation();
}

class MySmPhone implements MyCamera, MyRadio, MyGps {

    public MySmPhone() {
        System.out.println("This is Phone");
    }

    public void makeCall() {
        System.out.println("Making a call...");
    }

    public void takeSnap() {
        System.out.println("Taking a snap by MyCamera");
    }

    public void recordVideo() {
        System.out.println("Recording a video by MyCamera");
    }

    public void playRadio() {
        System.out.println("Playing Radio using MyRadio");
    }

    public void stopRadio() {
        System.out.println("Stop Radio !");
    }

    public void liveLocation() {
        System.out.println("Live location is Sharing by GPS...");
    }

    public void currentLocation() {
        System.out.println("Current location is sharing by GPS...");
    }


}

public class CWH_Lec_59 {
    public static void main(String[] args) {
        MySmPhone mySmPhone = new MySmPhone();
        mySmPhone.takeSnap();
        mySmPhone.recordVideo();
        mySmPhone.playRadio();
        mySmPhone.stopRadio();
        mySmPhone.liveLocation();
        mySmPhone.currentLocation();
        mySmPhone.makeCall();
        System.out.println("   ");


        MyCamera myCameraOfMySmPhone = new MySmPhone();   // MyCamera use as reference and MySmPhone use as class/objec
//        myCameraOfMySmPhone.currentLocation(); // not allow
        myCameraOfMySmPhone.takeSnap(); // allow
//        myCameraOfMySmPhone.makeCall  // not allowed  | method must be declared in parent interface
        // NOTE : j interface ti k Reference hisabe use korbo tar method guli k access kora jabe | onno interface er method guli k access kora jabe na


    }
}
