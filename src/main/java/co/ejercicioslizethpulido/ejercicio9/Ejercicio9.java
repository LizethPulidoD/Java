package co.ejercicioslizethpulido.ejercicio9;

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("FACTORIAL");
        System.out.println("Digite un numero entero positivo para obtener su factorial: ");
        int numero = scanner.nextInt();
        int resultado = 1;
        for (int i = 1; i <= numero; i++) {
            resultado *= i;
        }
        System.out.printf("%d! = %d%n", numero, resultado);
    }
}
