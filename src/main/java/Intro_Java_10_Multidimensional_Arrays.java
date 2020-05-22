public class Intro_Java_10_Multidimensional_Arrays
{
    public static void main(String[] args)
    {
        int[] values = {3, 5, 9};       //one dimensional array
        System.out.println(values[2]);      // se foloseste o singura dimensiune pentru a specifica valoarea 9

        //two dimensional array ~ array of arrays

        int [][] grid = {
                {3, 5, 10},     //primul rand (0)
                {2, 4},         //al 2lea rand (1)
                {1, 2, 3, 4}    //al 3lea rand (2)
        };
        System.out.println(grid[2][1]);     //print de pe randul 3, al 2lea element din coloana

        String [][] texts = new String[2][3];        //2 dimensional array of strings
        //System.out.println(texts[0][1]);        //va printa null pentru nu avem definit noul Array
        texts[0][1] = "Hello there";
        System.out.println(texts[0][1]);

        for (int row=0; row<grid.length; row++)
        {
            for (int column=0; column<grid[row].length; column++)
            {
                // "\t" tab intre numere; va printa numerele din grid intr-un singur rand cu spatiu intre ele
                System.out.print(grid[row][column] + "\t");
            }
            System.out.println();       //va printa numerele din array-ul multidimensional grid, exact cum apar ele declarate
        }
    }
}
