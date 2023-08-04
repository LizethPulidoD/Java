package co.ejercicioslizethpulido.ejercicio25;

import java.util.Scanner;

public class Ejercicio25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escriba una oracion: ");
        String oracion = scanner.nextLine();
        String[] palabras = oracion.split(" +");
        for (String palabra : palabras) {
            System.out.println(palabra);
        }
    }
}
