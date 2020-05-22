class Frog
{
    //String name;        //daca le treceam de forma private String name incapsulam cele 2 variabile name si age si ele nu mai erau vizibile
    //int age;
    private String name;
    private int age;

    public void setName(String name)
    {
        this.name = name;       //"this" se refera la obiectul in sine
    }
    public void setAge(int age)
    {
        this.age = age;
    }
    public String getName()     //metoda publica
    {
        return name;
    }
    public int getAge()
    {
        return age;
    }
}
public class Intro_Java_14_Setters_and_this
{
    public static void main(String[] args)
    {
    Frog frog1 = new Frog();

    /*frog1.name = "Bertie";        //settting an instance variable with equal sign
    frog1.age = 1;
    */
    frog1.setName("Bertieeee");     //calling a method

    System.out.println(frog1.getName());
    }
}
