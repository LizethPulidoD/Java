package co.ejercicioslizethpulido.ejercicio12;

import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("NUMEROS PRIMOS");
        System.out.print("Digite un número entero: ");
        int numero = scanner.nextInt();
        boolean esPrimo = esNumeroPrimo(numero);
        if (esPrimo) {
            System.out.printf("%d es un número primo", numero);
        } else {
            System.out.printf("%d no es un número primo", numero);
        }
    }

    private static boolean esNumeroPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
}
