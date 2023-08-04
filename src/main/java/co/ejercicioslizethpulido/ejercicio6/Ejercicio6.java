package co.ejercicioslizethpulido.ejercicio6;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite un numero entero: ");
        int numero = scanner.nextInt();
        if (numero > 0) {
            System.out.println("Es un numero positivo");
        } else if (numero == 0) {
            System.out.println("Es cero");
        } else {
            System.out.println("Es un numero negativo");
        }
    }
}
