package by.vvod.vvod_vyvod;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Homework_2_3 {
    public static void main(String[] args) {
        System.out.println("Введите целое число или \"stop\" для подсчёта среднего арифметического введенных чисел");
        while (true) {
            try {
                List<Integer> list = new ArrayList<>();
                Scanner scanner = new Scanner(System.in);
                while (!scanner.hasNext("stop")) {
                    int number = scanner.nextInt();
                    list.add(number);
                }
                int sum = 0;
                for (int i : list) {
                    sum += i;
                }
                if (list.isEmpty()) {
                    System.out.println("Введите хотя бы одно целое число");
                } else {
                    System.out.println("Средние значение:  " + sum / (float) list.size());
                }
            } catch (Exception e) {
                System.out.println("Это не целое число, попробуйте ещё раз!");
            }
        }
    }
}
