public class Intro_Java_4_for
{
    public static void main(String[] args)
    {
        for(int i = 10; i < 20; i++)    // (declarare variabila; apoi conditie; apoi ce trebuie sa faca
        {
            //System.out.println("Hello");
            //System.out.println("Hello " + i);   // se concateneaza intr-un string cu valoare interger i
            System.out.printf("The Value of I is: %d", i);   //printf metoda care printeaza pe o singura linie;
            // %d = litera pt int => care va afisa valoarea lui i in interiorul stringului
            // daca adaugam si \n se va printa pe o noua linie
        }
        for (int x = 0; x <= 5; x++)
        {
            System.out.printf("The New Value of J is: %d\n", x);
        }
    }
}
