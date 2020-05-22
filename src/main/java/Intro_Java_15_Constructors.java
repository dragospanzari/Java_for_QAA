class Machine
{
    private String name;
    private int code;

    public Machine()        //constructorul trebuie sa aiba acelasi nume ca si clasa
    {
        System.out.println("Constructor running");      //Constructorul va rula automat, pentru ca este apelat mai jos din programul principal
        //constructorul va rula de fiecare data cand un obiect este creat
        name = "Arnie";     //constructorul va seta numele declarat mai sus
    }
    public Machine(String name)     //constructor care accepta un String
    {
        System.out.println("Second Constructor running");
        this.name = name;
    }
    public Machine(String name, int code)
    {
        System.out.println("Third constructor running");
        this.name = name;
        this.code = code;
    }
}
public class Intro_Java_15_Constructors
{
    public static void main(String[] args)
    {
    Machine machine1 = new Machine();

    Machine machine2 = new Machine("vraja marii");      //va rula al 2lea constructor pt ca acesta este setat cu un String

    Machine machine3 = new Machine("George", 7);
    }
}
