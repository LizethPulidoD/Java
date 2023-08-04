package co.ejercicioslizethpulido.ejercicio21;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ejercicio21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite una frase: ");
        String cadena = scanner.nextLine().toLowerCase().replace(" ", "");
        System.out.println(contarLetras(cadena));
    }

    public static Map<Character, Integer> contarLetras(String cadena) {
        Map<Character, Integer> frecuenciaLetras = new HashMap<>();
        for (char caracter : cadena.toCharArray()) {
            int cantidadActual = frecuenciaLetras.getOrDefault(caracter, 0) + 1;
            frecuenciaLetras.put(caracter, cantidadActual);
        }
        return frecuenciaLetras;
    }
}
