package co.ejercicioslizethpulido.ejercicio30;

import java.util.ArrayList;

public class Ejercicio30 {
    public static void main(String[] args) {
        int[] numeros = {25, 5, 7, 11, 9, 11, 42, 42, 25, 2, 3, 2};
        ArrayList<Integer> numerosSinRepetir = new ArrayList<>();
        for (int numeroActual: numeros) {
            if (!numerosSinRepetir.contains(numeroActual)){
                numerosSinRepetir.add(numeroActual);
            }
        }
        System.out.println(numerosSinRepetir);
    }
}
