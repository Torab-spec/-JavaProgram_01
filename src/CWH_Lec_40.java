class User1 {
    private int id;
    private String names;

    public void setId(int i){
        id = i;

    }
    public  int getId(){
        return id;
    }
    public void setNames(String n){
        names =n;
    }
    public String getNames(){
        return names;
    }
}

public class CWH_Lec_40 {
    public static void main(String[] args) {
        User1 rina = new User1();
        //id = 230;  // through an error because id is private access modifier

        rina.setNames("Miss Rina");
        rina.setId(201);
        System.out.println(rina.getNames());
        System.out.println(rina.getId());

    }
}
