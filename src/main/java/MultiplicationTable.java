public class MultiplicationTable
{
    public static void main(String[] args)
    {
        int i;
        System.out.print("\nN\t 10*N \t 100*N \t 1000*N \n\n");
        for (i=1; i<=5; i++)
        {
            System.out.print("\n"+ i + "\t "+ (i*10) +"\t     " + (i*100) +"\t "+ (i*1000));
        }
    }
}
