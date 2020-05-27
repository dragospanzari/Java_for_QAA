package defaultpkg;

public class App {
    public static void main(String[] args) {
        Machine mach1 = new Machine();
        mach1.start();

        Person person1 = new Person("Bob");
        person1.greet();

        Intro_Java_23_Interfaces info1 = new Machine();      //machine implementeaza interfata, si de asta putem declara in acest fel
        info1.showInfo();

        Intro_Java_23_Interfaces info2 = person1;       //person1 este o referinta a obiectului Person
        info2.showInfo();

        System.out.println();
        outputInfo(mach1);
        outputInfo(person1);
    }
    private static void outputInfo(Intro_Java_23_Interfaces info)       //cu aceasta metoda putem accesa tot ce este definit in interfata
    {
        info.showInfo();
    }
}
