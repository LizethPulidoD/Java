package co.ejercicioslizethpulido.ejercicio22;

import java.util.Scanner;

public class Ejercicio22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("PALABRAS PALINDROMAS");
        System.out.println("Digite una palabra: ");
        String palabra = scanner.nextLine().toLowerCase();
        StringBuilder palabraInversa = new StringBuilder(palabra);
        if (palabra.equals(palabraInversa.reverse().toString())){
            System.out.printf("La palabra %s es palindroma", palabra);
        }else {
            System.out.printf("La palabra %s no es palindroma", palabra);
        }
    }
}
