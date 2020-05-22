public class Intro_Java_19_Inheritance
{
    public static void main(String[] args)
    {
        Intro_Java_19_Inh_Machine mach1 = new Intro_Java_19_Inh_Machine();      //Mostenire din cealalta clasa cu 19 Machine
        mach1.start();
        mach1.stop();

        Intro_Java_19_Inh_Car car1 = new Intro_Java_19_Inh_Car();
        //dupa ce clasa Copil a fost definita
        car1.start();
        car1.wipeWindShield();
        //car1.showInfo();      //showInfo a fost declarata private, deci nu poate fi accesata aici
        car1.stop();



    }
}
