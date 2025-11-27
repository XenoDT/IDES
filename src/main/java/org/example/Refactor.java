package org.example;

import java.util.Scanner;

public class Refactor {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opt;
        do {
            printMenu();
            opt = scanner.nextInt();
            scanner.nextLine();

            menu(opt, scanner);

        } while (opt != 3);
    }

    private static void menu(int opt, Scanner scanner) {
        if (opt == 1) {
            sumatory(scanner);
        } else if (opt == 2) {
            average(scanner);
        } else if (opt == 3) {
            System.out.println("Saliendo...");
        } else {
            System.out.println("Opción inválida");
        }
    }

    private static void average(Scanner scanner) {
        int num = getNum(scanner);

        int sum = 0;
        for (int i = 0; i < num; i++) {
            System.out.print("Introduce un número:");
            sum += scanner.nextInt();
            scanner.nextLine();
        }
        int med = sum / num;
        System.out.println("La media es " + med);
    }

    private static void sumatory(Scanner scanner) {
        int num = getNum(scanner);
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

    private static int getNum(Scanner scanner) {
        int num;
        do {
            System.out.print("Introduce un entero positivo: ");
            num = scanner.nextInt();
            scanner.nextLine();
        } while (num <= 0);
        return num;
    }
}
