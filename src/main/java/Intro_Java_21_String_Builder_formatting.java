public class Intro_Java_21_String_Builder_formatting {
    public static void main(String[] args) {
        //Inefficient
        String info = "";
        info += "My name is Bob.";
        info += " ";
        info += "I am a builder";

        System.out.println(info);

        //More Efficient
        StringBuilder sb = new StringBuilder();
        sb.append("My name is Sue.");//append method ads a reference to StringBuilder itself
        sb.append(" ");
        sb.append("I am a lion tamer");

        System.out.println(sb.toString());

        StringBuilder s = new StringBuilder();
        s.append("My name is Roger.")
        .append(" ")
        .append("I am o Rocket Scientist");

        System.out.println(s.toString());

        //Formatting

        System.out.print("Here is some text \tThat was a tab. \n That was a line.");     // \t = Tab, \n = New Line after
        System.out.println("More text");        // println printeaza o nou linie la sfarsit

        //Formatting Integers
        System.out.printf("Ai cumparat %d bunuri. \n", 20);     //printf = print format; %d e pentru numere, inlocuieste nr de dupa virgula in printf
        System.out.printf("total cost %d; Quantity is %10d\n", 5, 20);  // inlocuieste ambele numere de dupa virgula; %10d 10 spatii si apoi numarul

        for (int i=0; i<20; i++)
        {
            System.out.printf("%-2d: Some text \n", i);      //%2d doua spatii si apoi numarul
        }

        // Formatting Floating Point
        System.out.printf("Total Value: %f\n", 5.6);        //%f =  floating point
        System.out.printf("New Total Value with 2 decimals: %.2f\n", 5.6);      //.2f floating point reprezentat cu 2 decimale
        System.out.printf("New Total Value with 2 decimals: %.2f\n", 11.687456249);
        System.out.printf("New Total Value with 2 decimals: %6.2f\n", 123.687456249);       //in total 6 caractere dar 2 zecimale incluse, si punctul se numara ca si caracter
        System.out.printf("New Total Value with 2 decimals: %12.2f\n", 123.687456249);      //daca numarul e mai mare, adauga spatii inainte
        System.out.printf("New Total Value with 2 decimals: %-12.2f\n", 123.687456249);     //- adauga spatiu dupa nr afisat
    }
}
