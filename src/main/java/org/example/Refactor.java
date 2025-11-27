package org.example;

import java.util.Scanner;

public class Refactor {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int opt;
        do {
            printMenu();
            opt = scanner.nextInt();
            scanner.nextLine();

            menu(opt);

        } while (opt != 3);
    }

    private static void menu(int opt) {
        if (opt == 1) {
            sumatory();
        } else if (opt == 2) {
            average();
        } else if (opt == 3) {
            System.out.println("Saliendo...");
        } else {
            System.out.println("Opción inválida");
        }
    }

    private static void average() {
        int num = getNum();

        int sum = 0;
        for (int i = 0; i < num; i++) {
            System.out.print("Introduce un número:");
            sum += scanner.nextInt();
            scanner.nextLine();
        }
        int med = sum / num;
        System.out.println("La media es " + med);
    }

    private static void sumatory() {
        int num = getNum();
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            sum += i;
        }
        System.out.println("El sumatorio es " + sum);
    }

    private static void printMenu() {
        System.out.println("Elige una opción:");
        System.out.println("1. Sumatorio");
        System.out.println("2. Media");
        System.out.println("3. Salir");
    }

    private static int getNum() {
        int num;
        do {
            System.out.print("Introduce un entero positivo: ");
            num = scanner.nextInt();
            scanner.nextLine();
        } while (num <= 0);
        return num;
    }
}
