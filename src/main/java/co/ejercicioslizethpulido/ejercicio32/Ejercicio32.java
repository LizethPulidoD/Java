package co.ejercicioslizethpulido.ejercicio32;

import java.util.Scanner;

public class Ejercicio32 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("¿Que numero desea buscar en el arreglo? ");
        int numero = scanner.nextInt();
        int[] numeros = {1, 5, 7, 9, 8, 10, 2};
        boolean numeroEncontrado = false;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i]==numero){
                System.out.printf("El numero %d se encuentra en la posicion %d del arreglo", numero, i);
                numeroEncontrado = true;
            }
        }
        if (!numeroEncontrado){
            System.out.printf("El numero %d no se encuentra en el arreglo",numero);
        }
    }
}
