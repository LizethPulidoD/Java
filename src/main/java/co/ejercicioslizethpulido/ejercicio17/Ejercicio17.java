package co.ejercicioslizethpulido.ejercicio17;

import java.util.Scanner;

public class Ejercicio17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite un numero entero: ");
        int numeroInicial = scanner.nextInt();
        System.out.println("Digite un numero entero: ");
        int numeroFinal = scanner.nextInt();
        System.out.printf("Los numeros primos entre %d y %d son: %n", numeroInicial, numeroFinal);
        for (int i = numeroInicial; i <= numeroFinal; i++) {
            if (esNumeroPrimo(i)) {
                System.out.println(i);
            }
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
