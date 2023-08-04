package co.ejercicioslizethpulido.ejercicio31;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Ejercicio31 {
    public static void main(String[] args) {
        int[] numeros = {5, 1, 4, 8, 9, 10, 2};
        int numeroSiguiente;
        int numeroAuxiliar;
        int numeroActual;
        for (int i = 0; i < numeros.length-1; i++) {
            for (int j = 0; j < numeros.length-1; j++) {
                numeroActual = numeros[j];
                numeroSiguiente = numeros[j+1];
                if (numeroActual>numeroSiguiente){
                    numeroAuxiliar = numeroActual;
                    numeros[j] = numeroSiguiente;
                    numeros[j+1] = numeroAuxiliar;
                }
            }
        }
        System.out.println(Arrays.toString(numeros));
    }
}
