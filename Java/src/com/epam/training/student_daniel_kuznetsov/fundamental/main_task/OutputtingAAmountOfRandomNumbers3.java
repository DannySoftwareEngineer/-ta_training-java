package com.epam.training.student_daniel_kuznetsov.fundamental.main_task;

public class OutputtingAAmountOfRandomNumbers3 {
    public static void main(String[] args) {
        int a = 0;
        int b = 10;
        for (int i = 0; i < 5; i++) {
            int random_number1 = a + (int) (Math.random() * b);
            System.out.print(random_number1 + " ");
        }
    }
}

