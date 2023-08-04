package co.ejercicioslizethpulido.ejercicio19;

import java.util.Scanner;

public class Ejercicio19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite su nombre: ");
        String nombre = scanner.nextLine();
        System.out.println(nombre.toUpperCase());
        System.out.println(nombre.toLowerCase());
    }
}
