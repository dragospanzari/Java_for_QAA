public class Intro_Java_9_Arrays
{
    public static void main(String[] args)
    {
        int number = 7;     // value variable
        int[] numbers;      // numbers este o referinta
        numbers = new int[3];       //
        System.out.println(numbers[0]);     //va printa doar prima valoare care nu este alocata : 0

        numbers[0] = 10;
        System.out.println(numbers[0]);     //va printa indexul 0 cu valoarea 10
        numbers[1] = 15;
        numbers[2] = 20;
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);

        //iterate through the array
        for (int i=0; i<numbers.length; i++)
        {
            System.out.println(numbers[i]);
        }
        int[] arrray = {5, 6, 7, 8};
        for (int j=0; j<arrray.length; j++)
        {
            System.out.println(arrray[j]);
        }

        // arrays of strings

        //String[] words = new String[3];
        String[] fruits= {"banane","portocale","grapefruit","mere"};      //
        for (String fruit: fruits)
        {
            System.out.println(fruit);
        }
        int value = 0;
        String text = null;        //null = valoarea default a referintei; nu adauga nimic; null este un tip special
        System.out.println(text);
        String[] texts = new String[2];     //texts este o referinta; pt cele 2 vaori, java aloca default valoarea null
        System.out.println(texts[0]);
        texts[0] = "one";
    }
}
