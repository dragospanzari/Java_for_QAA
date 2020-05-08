import java.text.DecimalFormat;
import java.util.Scanner;
public class method_arrays
{
    public static double Average(int grades[], int max)
    {
        int sum = 0;
        double average = 0.0;
        for (int i=1; i<max; i++)
        {
            sum += grades[i];
            average = (double) sum/(double)i;
        }
        return average;
    }
    public static void main(String[] args)
    {
        int i;
        int[] grades = new int[20];
        Scanner input = new Scanner(System.in);
        DecimalFormat num = new DecimalFormat(".00");
        for (i=0; i<grades.length; i++)
        {
            System.out.printf("Enter grade: ");
            grades[i] = input.nextInt();
            if (grades[i]==-1)
                break;
        }
        System.out.println("Media notelor este: " +num.format(Average(grades,i-1)));
    }
}
