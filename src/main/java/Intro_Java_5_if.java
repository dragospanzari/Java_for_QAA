public class Intro_Java_5_if
{
    public static void main(String[] args)
    {
        boolean cond = 10 < 6;
        boolean cond1 = 6 != 5;     //6 diferit de 5?  true
        boolean cond2 = 4 == 3;     //4 =3 ? fals
        System.out.println(cond);
        System.out.println(cond1);
        System.out.println(cond2);

        if(4==4)
        {
            System.out.println("Yes, It's true !");
        }

        //if () simplu {}

        int myInt = 10;
        int myNewInt = 20;
        if (myInt < 20)
        {
            myInt++;
            System.out.println("Valoarea noua este" + myInt);
        }

        //if else () {}


        if (myInt >11)
        {
            System.out.println("Yes, it's bigger than 11");
        }
        else
        {
            System.out.println("No, It's equal or smaller than 11");
        }

        //if else if () {}

        if (myNewInt < 10)
        {
            System.out.println("My New Int ");
        }
        else if (myNewInt > 30)
        {
            System.out.println("codeaza java");
        }
        else
        {
            System.out.printf("Da, valoare New Int este: %d", myNewInt);
        }

        //

        int loop = 0;
        while(loop <= 50)
        {
            System.out.println("loop value is: " + loop);
            //loop++;
            if(loop == 5)
            {
                break;      // atunci cand bucla va ajunge la valoarea 5 se va opri executia
            }
            loop++;
            System.out.println("Running");
        }

    }
}
