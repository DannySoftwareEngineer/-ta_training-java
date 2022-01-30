package com.epam.training.student_daniel_kuznetsov.fundamental.optional_task2;

import java.util.Random;

public class Matrix1 {
    public static int getRandom(int min, int max) {
        Random ran = new Random();
        int n = max - min + 1;
        int i = ran.nextInt() % n;
        if (i < 0)
            i = -i;
        return min + i;
    }
    public static void main(String[] args)
    {
        int n = getRandom(2, 10);
        int m = getRandom(2, 10);
        int q;
        System.out.println("n =" + n + " ;m =" + m);
        int[][] a = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = getRandom(-100, 100);
            }
        }
        System.out.println("Created Matrix");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }
        // bubble sort
        for (int i = 0; i < n * m - 1; i++) {
            for (int j = i; j < m * n; j++) {
                if (a[i / m][i % m] > a[j / m][j % m]) {
                    q = a[i / m][i % m];
                    a[i / m][i % m] = a[j / m][j % m];
                    a[j / m][j % m] = q;
                }
            }
        }
        System.out.println("New Matrix");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }
    }
}