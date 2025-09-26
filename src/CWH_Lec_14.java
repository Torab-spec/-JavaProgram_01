//import java.util.Locale;

public class CWH_Lec_14 {
    public static void main(String[] args) {
        System.out.println("Working with `.length()`");
        String str1 = "Bina";
        System.out.println("The length of bina is " + str1.length());
        String str2 = str1.toLowerCase();
        System.out.println("toLowerCase " + str2);
        String str3 = str1.toUpperCase();
        System.out.println("toUpperCase " + str3);

        System.out.println(" ");

        System.out.println("Working with .trim()");
        String str4 = "   Rina     ";
        System.out.println("before using trim :" + str4);
        String str5 = str4.trim();
        System.out.println("after using trim " + str5);

        System.out.println(" ");

        String s6 =  "tina";
        System.out.println("With 1 argument : " + s6.substring(3));
        System.out.println("With 2 argument : " + s6.substring(1,3));

        System.out.println(" ");

        System.out.println("Working with Replace() " + s6.replace("t" , "r"));


        System.out.println("Hey my name is \n tor ab");
    }
}
