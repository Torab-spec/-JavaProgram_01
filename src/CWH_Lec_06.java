import java.util.Scanner;

public class CWH_Lec_06 {
    public static void main(String[] args) {
        System.out.println("Enter your each subject marks");

//        Creating a object for Scanner class
        Scanner marks = new Scanner(System.in);

//        Entering First Language Marks
        System.out.print("Enter your First Language Marks : ");
        float First_Language = marks.nextFloat();

//        Entering Second Language Marks
        System.out.print("Enter your Second Language Marks : ");
        float Second_Language = marks.nextFloat();

//        Entering Math Marks
        System.out.print("Enter your Math Subject Marks : ");
        float Math = marks.nextFloat();

//        Entering Chem Marks
        System.out.print("Enter your Chem Subject Marks : ");
        float Chem = marks.nextFloat();

//        Entering Bio Marks
        System.out.print("Enter your Bio Subject Marks :");
        float Bio = marks.nextFloat();

//        Sum of the total marks
        float sum = (First_Language + Second_Language + Math + Chem + Bio);

        float percent = (sum/5);
        System.out.print("The percentage is : ");
        System.out.print(percent);
        System.out.println("%");

    }
}
