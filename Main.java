package com.company;

import java.util.Scanner;

public class Main {

    public static void timer(int minutes, int seconds) {
        if(minutes > 59 || seconds > 59) {
            System.out.println("value is not allowed");
            return;
        }
        while(minutes != 0 || seconds != 0) {
            if (minutes < 10) {
                System.out.print("0" + minutes);
            } else {
                System.out.print(minutes);
            }
            System.out.print(":");
            if (seconds < 10) {
                System.out.println("0" + seconds);
            } else {
                System.out.println(seconds);
            }
            if(seconds == 0) {
                --minutes;
                seconds = 59;
            } else {
                --seconds;
            }
        }
        System.out.println("00:00");
        return;
    }

    public static int sumOfNumbers(String str) {
        int sum = 0;
        for(int i = 0; i < str.length(); ++i) {
            char symbol = str.charAt(i);
            boolean flag = Character.isDigit(symbol);
            if(flag){
                sum += Integer.parseInt(String.valueOf(symbol));
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int minutes = in.nextInt();
        int seconds = in.nextInt();
        timer(minutes, seconds);

        System.out.println("enter the string");
        String string = in.next();
        System.out.println(sumOfNumbers(string));


        Generic<Integer, String> generic = new Generic<>(4, "Hi!");
        generic.type();
    }
}
