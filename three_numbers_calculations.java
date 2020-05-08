import java.util.Scanner;
public class three_numbers_calculations
{
    public static void main(String[] args)
    {
        int x, y, z, sum, mult;
        long avg;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number:");
        x = input.nextInt();
        System.out.println("Enter the second number:");
        y = input.nextInt();
        System.out.println("Enter the third number:");
        z = input.nextInt();
        sum = (x + y + z);
        System.out.println("The sum of the three numbers is: " +sum);
        mult = (x * y * z);
        System.out.println("The multiplication of the three numbers is: " +mult);
        avg = (sum / 3);
        System.out.println("The average of three numbers is: " +avg);

        if (x > y && x > z )
        {
            System.out.println("The first number " +x+ " is Larger");
        }
        else if (y > x && y > z)
        {
            System.out.println("The second number " +y+ " is Larger");
        }
        else
        {
            System.out.println("The third number " +z+ " is Larger");
        }
    }
}
