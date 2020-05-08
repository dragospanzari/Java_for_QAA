import java.util.Scanner;

public class ProductOfFiles
{
    public static void main(String[] args)
    {
        int prod;
        Scanner input = new Scanner(System.in);
        System.out.println("enter the First Number:");
        int number1 = input.nextInt();
        System.out.println("enter the second number:");
        int number2 = input.nextInt();
        System.out.println("enter the third number:");
        int number3 = input.nextInt();
        prod = (number1 * number2 * number3);
        System.out.println("The product of the 3 inserted numbers is:" +prod);
    }
}
