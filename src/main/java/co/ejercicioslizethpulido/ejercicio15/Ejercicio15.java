package co.ejercicioslizethpulido.ejercicio15;

import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite un numero entero positivo: ");
        int numero = scanner.nextInt();
        if (esCapicua(numero)) {
            System.out.printf("El numero %d es capicua", numero);
        } else {
            System.out.printf("El numero %d no es capicua", numero);
        }
    }

    public static boolean esCapicua(int numero) {
        StringBuilder dato = new StringBuilder(String.valueOf(numero));
        String datoInvertido = dato.reverse().toString();
        int numeroInvertido = Integer.parseInt(datoInvertido);
        return numeroInvertido == numero;
    }
}
