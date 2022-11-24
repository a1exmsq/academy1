package by.academy.lesson3.classwork;

import java.util.Scanner;

public class Task4 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int num = sc.nextInt();
        if (num % 2 == 0){
            System.out.println("число четное");
        } else {
            System.out.println("Число нечетное");
        }

    }
}
