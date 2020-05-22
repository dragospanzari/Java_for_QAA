import java.util.Scanner;

public class Intro_Java_6_User_Input
{
    public static void main(String[] args)
    {
        //Create Scanner object
        Scanner input = new Scanner(System.in);      //input este o variabila; cream un nou Scanner object prin new Scanner..

                //Output the prompt for text
        System.out.println("Enter a new line of text: ");

        //Wait for the user input;
        String line = input.nextLine();

        //Tell them what they entered
        System.out.println("You entered: " + line);

                //Output the prompt for numbers
        System.out.println("Enter a integer number: ");

        //Wait for the user input;
        int number = input.nextInt();

        //Tell them what  number they entered
        System.out.println("You entered the following int number: " + number);

                 //Output the prompt for floats
        System.out.println("Enter a floating point number: ");

        //Wait for the user input;
        float myFloat = input.nextFloat();

        //Tell them what  number they entered
        System.out.println("You entered the following floating number: " + myFloat);
    }
}
