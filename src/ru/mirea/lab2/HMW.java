package ru.mirea.lab2;

import java.util.Scanner;
public class HMW {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String text = scanner.nextLine();
        System.out.println("Вы ввели " + text.split(" ").length + " слов");
    }
}

