import java.util.Scanner;

public class CWH_Lec_13 {
    public static void main(String[] args) {

        //  String str2 = new String("Hey"); // define a string with new keyword

        Scanner name = new Scanner(System.in);

//        System.out.print("Enter you name ");
//        String str1 = name.next(); // only take before whiteSpace
//        System.out.println("Your name is : " + str1);

        System.out.print("Enter your full name");
        String str2  = name.nextLine();

        System.out.println("Your full name is : " + str2);


    }
}
