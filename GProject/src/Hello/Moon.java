package Hello;

import java.util.Scanner;

public class Moon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ваш вес:");
        System.out.println("Ваш вес на Луне равен: " + scanner.nextDouble()*0.17);
    }
}