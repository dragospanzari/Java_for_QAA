class Thing{
    public final static int LUCKY_NUMBER = 7;       //cu final se defineste o constanta custom; ea nu se mai poate modifica odata ce e scris final
    public String name;     //variabile de genul acesta, care nu sunt statice sunt denumite Instance Variables;

    public static String description;       //static: asa se declara o variabila statica; ele se mai cheama si Class Variables pt ca sunt asociate direct clasei

    public static int count = 0;

    public int id;

    public Thing()
    {
        id = count;
        count++;
    }
public void showName()      //instance method
{
    System.out.println("Object id " + id + ", " + description + " : " + name);
    //metodele instance pot accesa datele statice
}
public static void showInfo()       //metoda statica; ea nu poate afisa rezultatul unei variabile instanta de genul:
{
    //System.out.println("Static Method output");
    System.out.println(description);        //metodele statice pot accesa Variabilele statice, dar nu pot accesa variabilele instance
    //exemplu: System.out.println(name) - nu ca merge
}
}
public class Intro_Java_16_Static {
    public static void main(String[] args)
    {
    Thing.description = "I am a thing";

    System.out.println("Before Creating Objects: " + Thing.count);

    Thing thing1 = new Thing();
    Thing thing2 = new Thing();

    System.out.println("After Creating Objects: " + Thing.count);

    thing1.name = "Bob";
    thing2.name = "Sue";

     //   System.out.println(thing1.name);
     //   System.out.println(thing2.name);
    thing1.showName();
    thing2.showName();

    //Thing.description = "I am a thing";
        //System.out.println(Thing.description);

    Thing.showInfo();       //printeaza textul din clasa statica showInfo

        System.out.println(Math.PI);        //Clasa Math are constante atasate. Eg. Pi = 3.1415.... Aceste constante nu se pot schimba
        System.out.println(Thing.LUCKY_NUMBER);


    }

}
