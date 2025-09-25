public class CWH_Lec_15 {
    public static void main(String[] args) {
        // prob 1
        String s1 = "FINA";
        System.out.println("convert into lower case " + s1.toLowerCase());

        //prob 2
        System.out.println(" ");
        String s2 = "to Lower Case";
        System.out.println("Replacing space with underscore " + s2.replace(" ", "_"));

        //prob 3
        System.out.println(" ");
        String s3 = "Dear rina thanks a lot";
        System.out.println("Replacing rina with a : "+ s3.replace("rina", "a"));

        //prob 5
        System.out.println(" ");

        String s4 = "Dear Harry, \n \t\t This java course is really help full  \n \t\t\t\t\t\t\t\t\t\t tank you :)";
        System.out.println(s4);
    }
}
