package co.ejercicioslizethpulido.ejercicio7;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("TABLA DE MULTIPLICAR");
        System.out.println("Digite un numero entero: ");
        int numero = scanner.nextInt();
        System.out.printf("La tabla de multiplicar del numero %d es: %n", numero);
        for (int i = 0; i <= 10; i++) {
            System.out.printf("%d * %d = %d%n", numero, i, numero * i);
        }
    }
}
