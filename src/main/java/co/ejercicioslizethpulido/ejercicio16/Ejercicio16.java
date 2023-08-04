package co.ejercicioslizethpulido.ejercicio16;

import java.util.Scanner;

public class Ejercicio16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("SERIE FIBONACCI");
        System.out.println("Digite el numero de iteraciones deseado: ");
        int iteraciones = scanner.nextInt();
        int numeroAnterior = 0;
        int numeroActual = 1;
        int resultado = numeroAnterior + numeroActual;
        System.out.println(numeroAnterior);
        for (int i = 1; i < iteraciones; i++) {
            System.out.println(resultado);
            numeroAnterior = numeroActual;
            numeroActual = resultado;
            resultado = numeroAnterior + numeroActual;
        }
    }
}
