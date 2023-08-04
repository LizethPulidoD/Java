package co.ejercicioslizethpulido.ejercicio29;

public class Ejercicio29 {
    public static void main(String[] args) {
        int[] numeros = {25, 5, 7, 11, 9, 10, 42};
        int numeroMayor = numeros[0];
        for (int numeroActual: numeros) {
            if (numeroActual>numeroMayor) {
                numeroMayor = numeroActual;
            }
        }
        System.out.printf("El numero mayor es %d", numeroMayor);
    }
}
