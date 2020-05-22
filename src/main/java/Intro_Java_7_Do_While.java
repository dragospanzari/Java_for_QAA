import java.util.Scanner;

public class Intro_Java_7_Do_While
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        /*          // /* multiline comment
        System.out.println("Enter a integer number: ");
        int value = input.nextInt();
        while (value !=5)       //atat timp cat nu introducem valoarea 5, tot se va cere un numar
        {
            System.out.println("Enter a number: ");
            value = input.nextInt();


        }
        */
        int value = 0;
        do {
            System.out.println("Enter a integer number: ");
            value = input.nextInt();
            }
        while (value != 5);
        System.out.println("Got 5 !");
    }
}
