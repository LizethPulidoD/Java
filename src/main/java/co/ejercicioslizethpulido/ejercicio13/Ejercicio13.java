package co.ejercicioslizethpulido.ejercicio13;

import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite un numero decimal: ");
        float numero = scanner.nextFloat();
        System.out.printf("El numero redondeado a dos decimales es %.2f", numero);
    }
}
