import java.util.Scanner;
public class Larger_or_Equal
{
    public static void main(String[] args)
    {
        int number1, number2;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number:");
        number1 = input.nextInt();
        System.out.println("Enter the second number:");
        number2 = input.nextInt();
        if (number1 > number2)
        {
            System.out.println("The first number " +number1+ " is Larger");
        }
        else if (number2 > number1)
        {
                    System.out.println("The second number " +number2+ " is Larger");
        }
        else
            {
                System.out.println("The numbers are equal");
            }
    }
}
