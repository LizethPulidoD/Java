package co.ejercicioslizethpulido.ejercicio26;

import java.util.Scanner;

public class Ejercicio26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escriba una oracion: ");
        String oracion = scanner.nextLine().replaceAll(" +", "");
        System.out.println("La oracion tiene " + oracion.length() + " caracteres");
    }
}

