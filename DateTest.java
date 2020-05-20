import java.util.Scanner;

public class DateTest {
    public static void main(String[] args) {
        Date display = new Date (0,0,0);
        Scanner input = new Scanner(System.in);

        int day, month, year;

        System.out.println("introduceti ziua: ");
        day = input.nextInt();
        if (day > 1 & day <= 31)
            display.setDay(day);
        else
            System.out.println("Ziua din luna este invalida! Introduceti o cifra inre 1 si 31 corespunzatoare zilei dorite");
            day = input.nextInt();
            display.setDay(day);

        System.out.println("introduceti luna: ");
        month = input.nextInt();
        if (month > 1 & month <= 12)
            display.setMonth(month);
        else
            System.out.println("Luna este invalida! Introduceti o cifra intre 1 si 12 corespunzatoare pentru luna dorita");
            month = input.nextInt();
            display.setMonth(month);


        if (month == 2 & day > 28)
            System.out.println("Data introdusa este incorecta. Luna Februarie nu are mai mult de 28 zile");


        System.out.println("introduceti anul: ");
        year = input.nextInt();
        if (year >= 1000)
            display.setYear(year);
        else
            System.out.println("Anul introdus este invalid! Introduceti un an mai mare de 1000");
            year = input.nextInt();
            display.setYear(year);


        display.displayDate();
    }
}
