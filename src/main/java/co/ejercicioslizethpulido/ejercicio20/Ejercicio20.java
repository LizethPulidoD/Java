package co.ejercicioslizethpulido.ejercicio20;

import java.util.Scanner;

public class Ejercicio20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite una frase: ");
        StringBuilder cadena = new StringBuilder(scanner.nextLine());
        String cadenaInvertida = cadena.reverse().toString();
        System.out.println(cadenaInvertida);
    }
}
