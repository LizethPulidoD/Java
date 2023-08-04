package co.ejercicioslizethpulido.ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero1;
        int numero2;
        System.out.println("OPERACIONES BASICAS EN MATEMATICAS");
        System.out.println("Digite un numero entero: ");
        numero1 = scanner.nextInt();
        System.out.println("Digite un numero entero: ");
        numero2 = scanner.nextInt();
        int suma = numero1 + numero2;
        int resta = numero1 - numero2;
        int multiplicacion = numero1 * numero2;
        System.out.printf("Suma: %d + %d = %d%n", numero1, numero2, suma);
        System.out.printf("Resta: %d - %d = %d%n", numero1, numero2, resta);
        System.out.printf("Multiplicacion:  %d * %d = %d%n", numero1, numero2, multiplicacion);
        try {
            int division = numero1 / numero2;
            System.out.printf("Division: %d / %d = %d%n", numero1, numero2, division);
        } catch (ArithmeticException e){
            System.out.println("No es posible dividir entre 0");
        }
    }
}
