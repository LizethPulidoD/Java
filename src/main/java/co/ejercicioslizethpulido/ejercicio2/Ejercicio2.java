package co.ejercicioslizethpulido.ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("NUMEROS PARES E IMPARES ");
        System.out.println("Digite un numero entero: ");
        int numero = scanner.nextInt();
        if (numero % 2 == 0) {
            System.out.println("Es un numero par");
        } else {
            System.out.println("Es un numero impar");
        }
    }
}
