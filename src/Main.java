public class Main {
    public static void main(String[] args) {
//task1
        for (int i = 0; i <= 10; i = i + 1) {
            System.out.println(i);
        }
//task2
        for (int i = 10; i > 0; i = i - 1) {
            System.out.println(i);
        }
//task3
        for (int i = 0; i <= 17; i = i + 2) {
            System.out.println(i);
        }
//task4 (Выведите в консоль все числа от 10 до −10 от бо́льшего числа к меньшему.)
        for (int i = 10; i > -11; i = i - 1) {
            System.out.println(i);
        }
//task5 (Напишите программу, которая выводит в консоль все високосные года, начиная с 1904 года до 2096. В консоль результат должен выводиться в формате: «… год является високосным».)
        for (int i = 1904; i <= 2096; i = i + 4) {
            System.out.println("Високосный год " + i);
        }
//task6 (Напишите программу, которая выводит в консоль последовательность чисел:7 14 21 28 35 42 49 56 63 70 77 84 91 98)
        for (int i = 7; i <= 98; i = i + 7) {
            System.out.println(i);
        }
//task7 (Напишите программу, которая выводит в консоль последовательность чисел:1 2 4 8 16 32 64 128 256 512)
        for (int i = 1; i <= 512; i = i * 2) {
            System.out.println(i);
        }
//task8 (Посчитайте с помощью цикла for сумму годовых накоплений, если каждый месяц вы будете откладывать по 29 000 рублей «в банку». Выведите сумму накоплений за каждый месяц в консоль в формате: «Месяц …, сумма накоплений равна … рублей».)
        int deposit = 29000;
        int total = 0;
        for (int i = 0; i < 12; i++) {
            total = total + deposit;
        System.out.println("Месяц " + i + " , сумма накоплений равна " + total + " рублей");
        }
//task9 (Перепишите решение задачи выше при условии, что деньги вы откладывать будете не «в банку», а в банк под проценты — 12% годовых. Выведите сумму накоплений за каждый месяц в консоль в формате: «Месяц …, сумма накоплений равна … рублей».)
        int bankDeposit = 29000;
        int totalDeposit = 0;
        for (int i = 0; i < 12; i++) {
            totalDeposit = totalDeposit + totalDeposit /100;
            totalDeposit = totalDeposit + bankDeposit;
            System.out.println("Месяц " + i + " , сумма накоплений равна " + totalDeposit + " рублей");
        }
//task10 (Напишите программу, которая выводит в консоль таблицу умножения на 2)
        int namber = 2;
        for (int i = 1; i <= 10; i++) {
            System.out.println(namber + "*" + i + "=" + namber * i);
        }
    }
}