import java.util.Scanner;

public class CWH_Lec_18 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value : ");
        int age = sc.nextInt();

        switch (age) {
            case 18:
                System.out.println("This is 18");
                break;
            case 24:
                System.out.println("This is 24");
                break;
            case 30:
                System.out.println("This is 30");
                break;
            default:
                System.out.println("Default");
        }

    }
}
