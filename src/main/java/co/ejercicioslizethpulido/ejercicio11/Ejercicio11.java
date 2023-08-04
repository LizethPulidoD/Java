package co.ejercicioslizethpulido.ejercicio11;

import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("AREA DE UN TRIANGULO UTILIZANDO LA FORMULA DE HERON");
        System.out.println("Digite una longuitud: ");
        double ladoA = scanner.nextDouble();
        System.out.println("Digite una longuitud: ");
        double ladoB = scanner.nextDouble();
        System.out.println("Digite una longuitud: ");
        double ladoC = scanner.nextDouble();
        double semiperimetro = (ladoA + ladoB + ladoC) / 2;
        double area = Math.sqrt(semiperimetro * (semiperimetro - ladoA) * (semiperimetro - ladoB) * (semiperimetro - ladoC));
        System.out.printf("El area del triangulo es %.2f", area);
    }
}
