package co.ejercicioslizethpulido.ejercicio18;

import java.util.Random;

public class Ejercicio18 {
    public static void main(String[] args) {
        String contrasena = generarContrasenaAleatoria(8);
        System.out.println("Contrasena generada: " + contrasena);
    }
    public static String generarContrasenaAleatoria(int longitud) {
        String caracteresPermitidos = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        StringBuilder contrasenaGenerada = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < longitud; i++) {
            int indiceCaracter = random.nextInt(caracteresPermitidos.length());
            char caracterAleatorio = caracteresPermitidos.charAt(indiceCaracter);
            contrasenaGenerada.append(caracterAleatorio);
        }
        return contrasenaGenerada.toString();
    }
}
