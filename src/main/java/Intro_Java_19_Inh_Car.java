public class Intro_Java_19_Inh_Car extends Intro_Java_19_Inh_Machine    //Clasa Car e o clasa copil a clasei Machine
{

    public void start()     //pentru override metoda trebuie decalarata identic cu cea din machine
    {
        System.out.println("Car started.");     //ovveride la metoda din machine
    }
    public void wipeWindShield()
    {
    System.out.println("Wiping windshield");
    }
    private void showInfo()
    {
        System.out.println("Car Name: " + name);
    }
}
