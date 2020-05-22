class Broasca {
    private int id;     //variabilele trebuie sa inceapa cu litere mici in java
    private String name;

    public Broasca (int id, String name)
    {
        this.id = id;
        this.name = name;
    }
public String toString()        //toString este f util la debugging
{
    //return id + " :" + name;      // e ok, dar nu este eficienta
    /*StringBuilder sb = new StringBuilder();
    sb.append(id).append(" : ").append(name);
    return sb.toString();*/
    return String.format("%4d: %s", id, name);
}
}
public class Intro_Java_18_to_String
{
    public static void main(String[] args)
    {
    Broasca frog1 = new Broasca(7, "OacOac");
    Broasca frog2 = new Broasca(11, "Oaac");
    //frog1.                  //atunci cand punem . dupa noul obiect apar mai multe metode din metoda principala
        System.out.println(frog1);
        System.out.println(frog2);
    }
}
