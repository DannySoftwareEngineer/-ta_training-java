package com.epam.training.student_daniel_kuznetsov.fundamental.optional_task1;

import java.util.Scanner;
public class LengthOfNumber1 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String x = sc.nextLine();
            String longWord = "";
            String shortWord = x;
            for (String s : x.split(" ")) {
                if (s.length() > longWord.length()) longWord = s;
                if (s.length() < shortWord.length()) shortWord = s;
            }
            System.out.println("Max number is: '" + longWord + "'");
            System.out.println("Length : " + longWord.length());
            System.out.println("Min number is: '" + shortWord + "'");
            System.out.println("Length : " + shortWord.length());
        }
    }