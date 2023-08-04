package co.ejercicioslizethpulido.ejercicio33;

import java.util.HashMap;
import java.util.Map;

public class Ejercicio33 {
    public static void main(String[] args) {
        int[] numeros = {25, 5, 7, 11, 9, 11, 42, 42, 25, 2, 3, 2};
        Map<Integer, Integer> frecuenciaNumeros = new HashMap<>();
        for (int numero: numeros) {
            int cantidad = frecuenciaNumeros.getOrDefault(numero,0)+1;
            frecuenciaNumeros.put(numero,cantidad);
        }
        System.out.println(frecuenciaNumeros);
    }
}
