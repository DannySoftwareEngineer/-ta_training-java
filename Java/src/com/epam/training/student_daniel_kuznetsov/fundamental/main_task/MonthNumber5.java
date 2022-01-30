package com.epam.training.student_daniel_kuznetsov.fundamental.main_task;

import java.util.Scanner;

public class MonthNumber5 {
    public static void main(String[] args) {
        System.out.println("Enter number from 1 to 12");
        Scanner scan = new Scanner(System.in);
        int numberMonth = scan.nextInt();
        System.out.println(solve(numberMonth));
    }
    public static String solve(int numberMonth){
        String[] month = {"Error","January","February","March","April","May","June","July","August","September","October","November","December"};
        if(numberMonth > 0 && numberMonth<month.length) return month[numberMonth];
        return "Month not found";
    }
}
