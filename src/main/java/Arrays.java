import java.io.PrintStream;
import java.util.Scanner;
public class Arrays
{
    public static void main(String[] args)
    {
        int counts[]={0,0,0,0,0,0,0,0,0,0}; //counts array with 10 declared elements
        Scanner input = new Scanner(System.in);
        int bonus[] = new int[15];  //declare array bonus with 15 undeclared elements
        for (int i=0; i<bonus.length; i++)
        {
            bonus[i] = i+1;
            System.out.println(bonus[i]);
        }
        int bestScores[]={10,15,20,5,12};
        for (int j=0; j<bestScores.length; j++)
        {
            PrintStream printf = System.out.printf("%d\t", bestScores[j]);
        }
    }
}
