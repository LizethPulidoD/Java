package co.ejercicioslizethpulido.ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite un numero entero: ");
        int numero1 = scanner.nextInt();
        System.out.println("Digite un numero entero: ");
        int numero2 = scanner.nextInt();
        if (numero1 > numero2) {
            System.out.printf("El numero %d es mayor que el numero %d%n", numero1, numero2);
        } else if (numero1 == numero2) {
            System.out.println("Ambos numeros son iguales");
        } else {
            System.out.printf("El numero %d es mayor que el numero %d%n", numero2, numero1);
        }
    }
}
