import java.util.Scanner;
public class sphereVolume_method
{
    public static double sphereVolume (double radius)
    {
        return (4.0 / 3.0) * Math.PI * Math.pow (radius, 3);
    }
    public static void main(String[] args)
    {
        double radius;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the radius: ");
        radius = input.nextDouble();
        System.out.printf("The volume is: %.1f",sphereVolume(radius));
    }
}
