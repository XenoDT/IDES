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

            if (opt == 1) {
                int num = getNum(scanner);
                int sum = 0;
                for (int i = 1; i <= num; i++) {
                    sum += i;
                }
                System.out.println("El sumatorio es " + sum);
            } else if (opt == 2) {
                int num = getNum(scanner);

                int sum = 0;
                for (int i = 0; i < num; i++) {
                    System.out.print("Introduce un número:");
                    sum += scanner.nextInt();
                    scanner.nextLine();
                }
                System.out.println("La media es " + (sum / num));
            } else if (opt == 3) {
                System.out.println("Saliendo...");
            } else {
                System.out.println("Opción inválida");
            }

        } while (opt != 3);
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
