package java01Variables;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // F5 to debug the code
        // F9 to add breakpoints
        // Commentary: Ctrl K + Ctrl C
        // Go to line: Ctrl G

        System.out.println("---1. Variables ---");
        int temperatura = 30;
        byte miByte = 127;
        long a = 800000000000L;
        float altura = 1.65f;
        double precio = 9.99;

        // Casting Explicit
        double notaFinal = 3.9;
        int notaEntera = (int) notaFinal;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Dime tu edad");
        int edad = scanner.nextInt();

        System.out.println("Dime tu nombre");
        String nombre = scanner.nextLine();

        // Para evitar conflictos
        scanner.close();

    }
}
