class Persoana
{
    String name;
    int age;

    void speak()
    {
        System.out.println("My name is " + name);
    }
    //void calculateYearsToRetirement()
    int calculateYearsToRetirement()
    {
        int yearsLeft = 65 - age;
        //System.out.println(name + " has " + yearsLeft + " years till retirement");
        return yearsLeft;
    }
    int getAge()        //aceasta metoda este un getter, pentru ca returneaza ce este definit in corp
    {
        return age;     //va returna varsta
    }
    String getName()
    {
        return name;
    }
}
public class Intro_Java_12_Getters_Returns
{
    public static void main(String[] args)
    {
    Persoana person1 = new Persoana();
    person1.name = "John Smith";
    person1.age = 25;
    //person1.speak();        //returneaza metoda speak din clasa Persoana

    //person1.calculateYearsToRetirement();
    int years = person1.calculateYearsToRetirement();
    System.out.println(person1.name + " has " + years + " years till retirement");

    int age = person1.getAge();     // retuneaza metoda Getter getAge definita mai sus
    String name = person1.getName();

        System.out.println("Name is " + name);
        System.out.println("Age is " + age);
    }
}
