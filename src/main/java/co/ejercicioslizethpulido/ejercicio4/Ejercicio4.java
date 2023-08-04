package co.ejercicioslizethpulido.ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("MAYORIA DE EDAD EN COLOMBIA");
        System.out.println("Digite su edad: ");
        int edad = scanner.nextInt();
        if (edad>=18){
            System.out.println("Usted es mayor de edad");
        }else {
            System.out.println("Usted es menor de edad");
        }
    }
}
