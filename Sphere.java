import java.util.Scanner;
public class Sphere
{
    public static void main(String[] args)
    {
        double radius, volume;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the radius of the sphere: ");
        radius = input.nextDouble();
        volume = (4.0 / 3.0) * Math.PI * Math.pow (radius, 3);
        System.out.println("The volume is: " +volume);
    }
}
