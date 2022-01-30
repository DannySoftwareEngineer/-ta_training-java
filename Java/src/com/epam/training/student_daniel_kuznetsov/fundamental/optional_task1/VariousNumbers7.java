package com.epam.training.student_daniel_kuznetsov.fundamental.optional_task1;

import java.util.Scanner;

import static java.lang.Character.*;

public class VariousNumbers7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("n = ");
        int n = Integer.parseInt(sc.next());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the number: ");
            arr[i] = Integer.parseInt(sc.next());
        }
            boolean num = true;
            int number = 0;
            for (int a : arr) {
                if (a > 10) {
                    String str = Math.abs(a) + "";
                    num = true;
                    int i = 0;
                    while (true) {
                        if (i >= str.length()) break;
                        for (int j = i + 1; j < str.length(); j++) {
                            if (getNumericValue(str.charAt(i)) != getNumericValue(str.charAt(j))) {
                                continue;
                            }
                            num = false;
                            break;
                        }
                        if (!num) break;
                        i++;
                    }
                    if (!num) continue;
                    number = a;
                    break;
                }
            }

            System.out.println(num ? "The number consisting of only distinct digits:" + number : "Error");
            System.out.println();
        }
    }