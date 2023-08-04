package co.ejercicioslizethpulido.ejercicio23;

import java.util.Scanner;

public class Ejercicio23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escribe una oracion: ");
        String oracion = scanner.nextLine();
        int cantidadDePalabras = oracion.trim().split(" +").length;
        System.out.println(cantidadDePalabras);
    }
}
