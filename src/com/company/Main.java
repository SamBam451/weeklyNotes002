package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("hello world!");

        Scanner input = new Scanner(System.in);

        int age =  16;
        double gpa = 3.9;
        boolean isSnowy = true;
        String city = "Galloway";

        System.out.println(age + " | " + gpa + " | " + isSnowy);
        System.out.println(city);
        System.out.println(city.toUpperCase());
        System.out.println(city.toLowerCase());

        float pi = 3.14f;
        System.out.println(pi);
        //comment
        /*
        comment
         */
        int dailyHighs[] = {50, 60, 70, 80, 90};
        System.out.println(dailyHighs[0]);
        System.out.println(dailyHighs[1]);
        System.out.println(dailyHighs[2]);
        System.out.println(dailyHighs[0] + dailyHighs[0]);

        for(int i=0; i<=4; i++){
            System.out.println(dailyHighs[i]);
        }

        int quotient1 = 10/4;
        double quotient2 = 10.0/4;
        System.out.println(quotient1);
        System.out.println(quotient2);

        int i = 2;
        int result1 = i++ *2;
        int result2 = i++ *2;
        System.out.println(result1);
        System.out.println(result2);


        System.out.println("What is your name?");
        String name = input.nextLine();
        System.out.println("Hello" + name.toUpperCase());
    }
}
