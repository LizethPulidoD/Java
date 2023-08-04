package co.ejercicioslizethpulido.ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("AREA Y PERIMETRO DE UN CIRCULO");
        System.out.println("Digite el radio del circulo: ");
        double radio = scanner.nextDouble();
        double area = Math.PI * Math.pow(radio, 2);
        double perimetro = 2 * Math.PI * radio;
        System.out.println("Area: " + area);
        System.out.println("Perimetro: "+ perimetro);
    }
}
