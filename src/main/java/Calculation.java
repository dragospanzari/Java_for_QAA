import java.util.Scanner;

public class Calculation
{
    public static void main(String[] args)
    {
        double sum, dif, mult, div ;
        Scanner input = new Scanner(System.in);
        System.out.println("enter the first number:");
        int number1 = input.nextInt();
        System.out.println("enter the second number:");
        int number2 = input.nextInt();
        sum = (number1 + number2);
        dif = (number1 - number2);
        mult = (number1 * number2);
        div = (number1 / number2);
        System.out.println("The Sum of the 2 inserted numbers is:" +sum);
        System.out.println("The Difference of the 2 inserted numbers is:" +dif);
        System.out.println("The Multiply of the 2 inserted numbers is:" +mult);
        System.out.println("The Division of the 2 inserted numbers is:" +div);
    }
}
