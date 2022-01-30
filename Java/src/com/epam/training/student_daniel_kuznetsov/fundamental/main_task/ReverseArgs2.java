package com.epam.training.student_daniel_kuznetsov.fundamental.main_task;

import java.util.Scanner;

public class ReverseArgs2 {
    public static void main(String[] args) {
        System.out.print("Enter the argument: ");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        char[] arr = text.toCharArray();
        int a = arr.length;
        while (a > 0) {
            int i = a - 1;
            System.out.print(arr[i]);
            a--;
        }
    }
}