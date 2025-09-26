import java.util.Scanner;

public class CWH_Lec_16 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Please Enter your age : ");
        int age = sc.nextInt();

        if (age > 18) {
            System.out.println("Yeah boy you can drive");
        } else if (age == 18) {
            System.out.println("Do you have your license ? ");
        } else {
            System.out.println("You can't drive ");
        }


    }
}
