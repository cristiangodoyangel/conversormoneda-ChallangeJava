package com.alura.alumnos;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("===========================================");
            System.out.println("Seleccione una moneda para convertir:");
            System.out.println("===========================================");
            System.out.println("1. Dólar EEUU      => Peso Chileno");
            System.out.println("2. Peso Chileno    => Dólar EEUU");
            System.out.println("3. Salir");
            System.out.println("===========================================");

            System.out.print("Ingrese su opción: ");
            int opcion = scanner.nextInt();

            if (opcion == 3) {
                System.out.println("Saliendo del programa, Gracias por usar el conversor.");
                break;
            } else if (opcion < 1 || opcion > 3) {
                System.out.println("Opción inválida. Intente de nuevo.");
            } else {
                System.out.println("Funcionalidad en construcción...");
            }
        }
        scanner.close();
    }
}
