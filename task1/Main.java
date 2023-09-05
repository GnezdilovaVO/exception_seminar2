package Homework.task1;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите положительное число: ");
        int num1 = scanner.nextInt();
        try {
            if (num1==0 || num1 < 0) {
                throw new InvalidNumberExctetion("Некорректное число");
            } else {
                System.out.println("Коррктное число");
            }
            
        } catch (InvalidNumberExctetion e) {
            System.out.println(e.getMessage());
        }


        scanner.close();
    }
}
