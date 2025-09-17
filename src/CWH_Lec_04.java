import java.util.Scanner;
public class CWH_Lec_04 {
    public static void main(String[] args) {

        System.out.println("Taking input from user --");

        Scanner num = new Scanner(System.in);
        System.out.print("Enter first number ");
        int num1 = num.nextInt();

        System.out.print("Enter second number ");
        int num2 = num.nextInt();

        System.out.print("The total sum is : ");
        int sum = num1 + num2;
        System.out.println(sum);

    }
}
