class Person {
    //  Instance variables (data or "state")
    String name;
    int age;

    //classes can contain:
    //1. Data (State of objects) like: nume, locatie, adresa, stare, varsta....
    //2. Subroutines (methods)
    //methods are soubroutines of the class in Java
    void speak()         //methods always start with lowercase letter, the next word start with uppercase; They always have ()
    {
        //System.out.println("Hello");        //*
        for (int i=0; i<3; i++)
        {
            System.out.println("My name is: " + name + " and I am " + age + " years old");
        }
    }
    void sayHello()
    {
        System.out.println("Hello there !");
    }
}
public class Intro_Java_11_Classes_Objects_Methods      //doar o singura clasa publica
{
    public static void main(String[] args)      //Java programs start where "main" is declared ;4
            //main este o subrutina a clasei, sau mai bine zis ete "main" method
    {
        // Person person1 : se declara variabila de tip persoana
    Person person1 = new Person();      //"new Person()":  se creaza un nou obiect (numit person1)
    person1.name = "Joe Black";
    person1.age = 37;
    person1.speak();        //*va executa metoda...numele person1.name nu va mai aparea mai jos, ci doar "Hello"
    person1.sayHello();

    Person person2 = new Person();      // se creaza un nou obiect
    person2.name = "Sarah Smith";
    person2.age = 20;
    person2.speak();

        System.out.println("Numele persoanelor este: " + person1.name +" si " + person2.name);

    }
}
