package com.epam.training.student_daniel_kuznetsov.fundamental.main_task;
import java.util.Scanner;
public class NumberAsStringArgument4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter first integer: ");
        int x = scan.nextInt();
        System.out.print("Enter second integer: ");
        int y = scan.nextInt();
        System.out.println("sum= " + (x + y));
        System.out.println("multiplication = " + (x * y));
    }
}
