class Robot
{
    public void speak(String text)      //text este o variabila de tip Stringin cadrul metodei speak
            //(String text) este un parametru; un parametru este o variabila trecuta intr-o metoda
    {
        //System.out.println("Robot say Hello");
        System.out.println(text);
    }
    public void jump(int height)    //metoda jump va prelua parametrul int height
    {
        System.out.println("Jumping: " + height);
    }
    public void move(String direction, double distance)     //Stringul va fi intotdeauana primul in cadrul metodei
    {
        System.out.println("Moving " + distance + "m in direction " + direction);
    }
}
public class Intro_Java_13_Method_parameters
{
    public static void main(String[] args)
    {
    Robot sam = new Robot();
    sam.speak("Hi. I'm Sam");       //passing a parameter to a method (speak)
        sam.jump(35);
        sam.move("West", 12.30);
        String greeting = "Hello there";
        sam.speak(greeting);
    }
}
