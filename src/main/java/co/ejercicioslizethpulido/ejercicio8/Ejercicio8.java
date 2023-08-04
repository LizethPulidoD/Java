package co.ejercicioslizethpulido.ejercicio8;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ADIVINA EL NUMERO");
        Random random = new Random();
        int numeroAleatorio = random.nextInt(100) + 1;
        int numeroIngresado;
        int intentos=0;
        do {
            System.out.println("Ingresa un numero entero: ");
            numeroIngresado = scanner.nextInt();
            intentos++;
            if (numeroIngresado > numeroAleatorio) {
                System.out.println("El numero ingresado es mayor que el numero generado por el sistema. Intenta de nuevo.");
            } else if (numeroIngresado < numeroAleatorio) {
                System.out.println("El numero ingresado es menor que el numero generado por el sistema. Intenta de nuevo.");
            } else {
                System.out.printf("Adivinaste el numero %d en %d intentos", numeroAleatorio, intentos);
            }
        } while (numeroAleatorio != numeroIngresado);
    }
}
