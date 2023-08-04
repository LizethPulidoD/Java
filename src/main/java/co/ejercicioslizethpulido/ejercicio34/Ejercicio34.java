package co.ejercicioslizethpulido.ejercicio34;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio34 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = {5, 1, 4, 8, 9, 10, 2};
        System.out.print("Ingrese la cantidad de posiciones a rotar: ");
        int posiciones = scanner.nextInt();
        System.out.print("Ingrese 'izquierda' o 'derecha' para la dirección de la rotación: ");
        String direccion = scanner.next();
        if (direccion.equalsIgnoreCase("izquierda")) {
            rotarIzquierda(numeros, posiciones);
            System.out.println("Arreglo después de la rotación: " + Arrays.toString(numeros));
        } else if (direccion.equalsIgnoreCase("derecha")) {
            rotarDerecha(numeros, posiciones);
            System.out.println("Arreglo después de la rotación: " + Arrays.toString(numeros));
        } else {
            System.out.println("Dirección no válida. Use 'izquierda' o 'derecha'.");
        }
    }

    public static void rotarIzquierda(int[] arreglo, int posiciones) {
        int[] temp = Arrays.copyOf(arreglo,posiciones);
        for (int i = 0; i < posiciones; i++) {
            temp[i] = arreglo[i];
        }
        for (int i = 0; i < arreglo.length - posiciones; i++) {
            arreglo[i] = arreglo[i + posiciones];
        }
        for (int i = arreglo.length - posiciones, j = 0; i < arreglo.length; i++, j++) {
            arreglo[i] = temp[j];
        }
    }

    public static void rotarDerecha(int[] arreglo, int posiciones) {
        int[] temp = Arrays.copyOf(arreglo,posiciones);
        for (int i = arreglo.length - posiciones, j = 0; i < arreglo.length; i++, j++) {
            temp[j] = arreglo[i];
        }
        for (int i = arreglo.length - posiciones - 1; i >= 0; i--) {
            arreglo[i + posiciones] = arreglo[i];
        }
        for (int i = 0; i < posiciones; i++) {
            arreglo[i] = temp[i];
        }
    }
}
