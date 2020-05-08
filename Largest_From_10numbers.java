import java.util.Scanner;
public class Largest_From_10numbers {
    public static void main(String[] args)
    {
        int counter = 10;
        int largest = 0;
        int number;
        Scanner input = new Scanner(System.in);
        System.out.println("enter the numbers: ");
        int n = input.nextInt();
        number = input.nextInt();
        for (int i = 1; i < counter; i++)
        {
            number = input.nextInt();
            if (number > largest)
            {
                largest = number;
            }
        }
        System.out.println("largest number is: " +largest);
    }
}
