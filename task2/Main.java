package Homework.task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое положительное число: ");
        int num1 = scanner.nextInt();
        System.out.print("Введите второе положительное число: ");
        int num2 = scanner.nextInt();
        try {
            if (num2 == 0) {
                throw new DivisionByZeroException("На ноль делить нельзя");
            } else {
                System.out.println(num1/num2);
            }
            
            
        } catch (DivisionByZeroException e) {
            System.out.println(e.getMessage());
        }


        scanner.close();
    }
}
