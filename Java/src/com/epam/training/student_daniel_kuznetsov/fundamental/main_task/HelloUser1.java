package com.epam.training.student_daniel_kuznetsov.fundamental.main_task;

import java.util.Scanner;

public class HelloUser1 {
    public static void main(String[] args) {
        Scanner userInputScanner = new Scanner(System.in);
        System.out.print("What's your name? ");
        String name = userInputScanner.next();
        System.out.println("Hello " + name + "!");
    }
}


