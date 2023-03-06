package by.vvod.vvod_vyvod;

//Необходимо реализовать программу, которая будет считывать
//числа, введенные пользователем, пока пользователь не введет
//"stop" слово. по команде "status" необходимо вывести введенные
//цифры в отсортированном виде (от меньшего к большему).

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Homework_3_ {
    public static void main(String[] args) {
        System.out.println("Введите целое число, или \"status\" для сортировки полученного массива или \"stop\" для выхода из программы");
        while (true) {
            List<Integer> list = new ArrayList<>();
            Scanner scanner = new Scanner(System.in);
            while (!scanner.hasNext("status")) {
                try {
                    list.add(scanner.nextInt());
                } catch (Exception e) {
                    if (scanner.hasNext("stop")) {
                        scanner.close();
                    }
                    System.err.println("Это не целое число, попробуйте ещё раз!");
                    scanner.next();
                }
            }
            List<Integer> sorted = list.stream().sorted().collect(Collectors.toList());
            sorted.forEach(System.out::println);
            scanner.next();
        }
    }
}