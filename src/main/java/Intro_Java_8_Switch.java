import java.util.Scanner;

public class Intro_Java_8_Switch
{
    public static void main(String[] args)
    {
        //switch = different actions depending on the value of variable; most common Int & String
        Scanner input = new Scanner(System.in);
        System.out.println("Pls enter a command: ");
        /*String text = input.nextLine();

        switch(text)
        {
            case "start":       //
                System.out.println("Machine Started !");
                break;
            case "stop":
                System.out.println("Machine is stopped !");
                break;
            default:        //default tot timpul sta la sfarsit
                System.out.println("command not recognized...");
        }
        */
        int number = input.nextInt();
        switch (number)
        {
            case 1:
                System.out.println("Machine Started !");
                break;
            case 10:
                System.out.println("Machine is stopped !");
                break;
            default:        //default tot timpul sta la sfarsit
                System.out.println("Number not recognized...");
        }

    }
}
