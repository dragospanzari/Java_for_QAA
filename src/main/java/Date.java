import java.util.Scanner;

public class Date {
    int monthDate;
    int dayDate;
    int yearDate;

    public Date(int month, int day, int year) {

        /*if (day > 1 & day <= 31)
            dayDate = day;
        else
            System.out.println("Ziua din luna este invalida! Introduceti o cifra inre 1 si 31 corespunzatoare zilei dorite");

        if (month > 1 & month <= 12)
            monthDate = month;
        else
            System.out.println("Luna este invalida! Introduceti o cifra intre 1 si 12 corespunzatoare pentru luna dorita");

        if (year >= 1000)
            yearDate = year;
        else
            System.out.println("Anul introdus este invalid! Introduceti un an mai mare de 1000");*/
    }

    public void setDay(int day) {
        dayDate = day;
    }
    public int getDay() {
        return dayDate;
    }

    public void setMonth(int month) {
        monthDate = month;
    }
    public int getMonth() {
        return monthDate;
    }

    public void setYear(int year) {
        yearDate = year;
    }

    public int getYear() {
        return yearDate;
    }
    public void displayDate() {
        System.out.println("Data introdusa este: " + getDay() + "/" + getMonth() + "/" + getYear());
    }
}


