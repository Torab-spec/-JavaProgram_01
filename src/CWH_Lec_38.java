
class Phone {
    String compnayName = "vivo";
    int battery = 4000;
    String camera = "40 megha pixels";
}


class User {// This is our custom class
    int id;
    String names;

    public void printDetails() {
        System.out.println("user id is " + id);
        System.out.println("user name is " + names);
    }
    
}

public class CWH_Lec_38 {

    public static void main(String[] args) {
        System.out.println("Crating our own custom class");

        User users = new User(); //Instanting a nes custom Class (User) object;
        users.id = 102;  // setting property value
        users.names = "Mis Rina";
        System.out.println(users.id);  // Getting property value
        System.out.println(users.names);
        System.out.println("_");

        User tina = new User();
        tina.id = 33;
        tina.names = "Tina";
        tina.printDetails();
        User rina = new User();
        rina.id = 44;
        rina.names = "Rina";
        rina.printDetails();
        System.out.println("_");


        users.printDetails();


        System.out.println(" ");
        System.out.println("Phone class");
        Phone andrd = new Phone();
        System.out.println(andrd.compnayName);
        System.out.println(andrd.battery);
        System.out.println(andrd.camera);
    }

}
