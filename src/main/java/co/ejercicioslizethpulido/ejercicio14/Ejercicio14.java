package co.ejercicioslizethpulido.ejercicio14;

import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite un numero entero positivo: ");
        int numero = scanner.nextInt();
        if (esNumeroPerfecto(numero)) {
            System.out.printf("%d es un numero perfecto", numero);
        } else {
            System.out.printf("%d no es un numero perfecto", numero);
        }
    }

    public static boolean esNumeroPerfecto(int numero) {
        int sumaDivisores = 0;
        for (int i = 1; i <= numero / 2; i++) {
            if (numero % i == 0) {
                sumaDivisores += i;
            }
        }
        return sumaDivisores == numero;
    }
}
