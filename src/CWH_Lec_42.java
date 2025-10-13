class User2 {
    private int id;
    private String names;

    public User2() {
        id = 999;
        names = "Miss Tina";

//        System.out.println(id);
//        System.out.println(names);
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
        User2 tina = new User2();
        // tina.setId(10); // Setting id using setId Method
        System.out.println(tina.getId()); // Getting id value using getId method
        System.out.println(tina.getNames());

    }
}
