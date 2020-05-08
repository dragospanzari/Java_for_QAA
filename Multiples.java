import java.util.Scanner;

public class Multiples
{
    public static void main(String[] args)
    {
        int number1, number2, remainder;
        Scanner input = new Scanner(System.in);
        System.out.println("enter the First Number:");
        number1 = input.nextInt();
        System.out.println("enter the second number:");
        number2 = input.nextInt();
        remainder = (number1 % number2);
        if (remainder == 0)
        {
            System.out.println("first number " +number1+ " is a multiple of the second number " +number2);
        }
        else
            {
            System.out.println("first number " + number1 + " is not a a multiple of the second number " + number2);
            }
    }
}
