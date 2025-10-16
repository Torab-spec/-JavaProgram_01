class User2 {
    private int id;
    private String names;
/*
    public User2() {
        id = 999;
        names = "Miss Tina";

    }
    */

    // Using para meter in constructor
    public User2(int myId, String myName) {
        id = myId;
        names = myName;

    }

    public void setId(int i) {
        id = i;

    }

    public int getId() {
        return id;
    }

    public void setNames(String n) {
        names = n;
    }

    public String getNames() {
        return names;
    }
}

public class CWH_Lec_42 {
    public static void main(String[] args) {
//        User2 tina = new User2();
        // tina.setId(10); // Setting id using setId Method

        User2 tina = new User2(33, "Mina");

        System.out.println(tina.getId()); // Getting id value using getId method
        System.out.println(tina.getNames());

    }
}
