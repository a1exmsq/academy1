package by.academy.lesson3.classwork;

public class Task5 {
    public static void main(String[] args) {

        int s = 1_370_000;
        int sec;
        int m;
        int min;
        int h;
        int hour;
        int day;
        int week;

        sec = s % 60;
        m = (s - sec) / 60;
        min = m % 60;
        h = (m - min) / 60;
        day = (h / 24);
        hour = (h - day * 24);
        week = day / 7;
        day = day - week * 7;

        System.out.println(week + " недель " + day + " дней " + hour + " часов " + min + " минут " + sec + " секунд ");

    }
}
