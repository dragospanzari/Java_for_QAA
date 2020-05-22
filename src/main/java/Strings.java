import java.util.Scanner;
public class Strings
{
    public static void main(String[] args)
    {
    Scanner input = new Scanner(System.in);
    System.out.println("Insert a word:");
    String cuvant = input.next();
    System.out.println(cuvant.toUpperCase()+cuvant.toLowerCase());
    }
}
