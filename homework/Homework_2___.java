package by.vvod.vvod_vyvod;

import java.util.Scanner;

public class Homework_2___ {
    public static void main(String[] args) {
        System.out.println("Введите целое число или \"stop\" для подсчёта среднего арифметического введенных чисел");
        while (true) {
            Scanner scanner = new Scanner(System.in);
            int summa = 0;
            int count = 0;
            while (!scanner.hasNext("stop")) {
                try {
                    summa += scanner.nextInt();
                    count++;
                } catch (Exception e) {
                    System.err.println("Это не целое число, попробуйте ещё раз!");
                    scanner.next();
                }
            }
            System.out.println((double) (summa / count));
        }
    }
}
