package co.ejercicioslizethpulido.ejercicio24;

import java.util.Scanner;

public class Ejercicio24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escriba una oracion: ");
        String oracion = scanner.nextLine();
        System.out.println("¿Que letra desea reemplazar? ");
        char letra = scanner.next().charAt(0);
        System.out.println("¿Por cual letra desea reemplazarlo? ");
        char reemplazo = scanner.next().charAt(0);
        System.out.println(oracion.replace(letra,reemplazo));
    }
}
