package ru.geekbrains.guess_the_number;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        for (int i = 10; i < 30; i += 10){
            
        }
//        System.out.println("Ваша задача угадать число.");
//        int range = 30;
//        int number = (int)(Math.random() * range);
//        playLevel(range, number);
//        scanner.close();
    }

    private static void playLevel(int range, int number){
        int total = 1;
        while(true){
            System.out.println("Угадайте число от 0 до " + range);
            int input_number = scanner.nextInt();
            if (input_number == number){
                System.out.println("Вы угадали!");

                System.out.println("Количество попыток: " + total);
                break;
            } else if (input_number > number){
                System.out.println("Загаданное число меньше");
            } else{
                System.out.println("Загаданное число больше");
            }
            total++;
        }
    }
}
