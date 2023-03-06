package by.vvod.vvod_vyvod;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Homework_2_ {
    public static void main(String[] args) {
        System.out.println("Введите целое число или \"stop\" для подсчёта среднего арифметического введенных чисел");
        while (true) {
            List<Integer> list = new ArrayList<>();
            Scanner scanner = new Scanner(System.in);
            while (!scanner.hasNext("stop")) {
                try {
                    int number = scanner.nextInt();
                    list.add(number);
                } catch (Exception e) {
                    System.err.println("Это не целое число, попробуйте ещё раз!");
                    scanner.next();
                }
            }
            Integer[] numbers = list.toArray(new Integer[0]);
            Integer sum = 0;
            for (Integer i = 0; i < numbers.length; i++) {
                sum += numbers[i];
            }
            System.out.println((double) (sum / (numbers.length)));
        }
    }
}
