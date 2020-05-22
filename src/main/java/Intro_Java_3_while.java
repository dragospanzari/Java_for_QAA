public class Intro_Java_3_while
{
    public static void main(String[] args)
    {
        boolean loop = true;
        System.out.println(loop);
        boolean loop1 = 4 < 5;
        System.out.println(loop1);
        boolean loop2 = 4 < 1;
        System.out.println(loop2);

        int value = 10;
        boolean loop3 = value < 20;
        //System.out.println(loop3);
        while (value <= 20)
        {
            System.out.println("Value is: " + value);
            value = value+1;
        }
    }
}
