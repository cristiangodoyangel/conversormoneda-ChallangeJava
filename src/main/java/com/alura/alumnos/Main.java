package com.alura.alumnos;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Consulta consulta = new Consulta();

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
                System.out.println("Gracias por usar el conversor. ¡Adiós!");
                break;
            } else if (opcion < 1 || opcion > 3) {
                System.out.println("Opción inválida. Intente de nuevo.");
                continue;
            }

            System.out.print("Ingrese la cantidad a convertir: ");
            double cantidad = scanner.nextDouble();

            String base = opcion == 1 ? "USD" : "CLP";
            String destino = opcion == 1 ? "CLP" : "USD";

            try {
                String resultado = consulta.obtenerConversion(base, destino);
                System.out.println("Respuesta de la API: " + resultado);
            } catch (IOException | InterruptedException e) {
                System.out.println("Error al realizar la conversión: " + e.getMessage());
            }
        }

        scanner.close();
    }
}
