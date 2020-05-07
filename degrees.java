import java.util.Scanner;

public class degrees {
    public static void main(String[] args) {
        double celsius, fahrenheit;
        Scanner input = new Scanner(System.in);
        System.out.println("enter the temperature in Fahrenheit Degrees:");
        fahrenheit = input.nextDouble();
         celsius = 5.0/9.0 * (fahrenheit - 32);
        System.out.println("The degrees in Celsius degrees is:" + celsius);
    }
}
