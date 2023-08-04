package co.ejercicioslizethpulido.ejercicio27;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escriba una oracion: ");
        String oracion = scanner.nextLine();
        Arrays.stream(oracion.split(" +")).sorted().forEach(System.out::println);
    }
}
