package co.ejercicioslizethpulido.ejercicio28;

public class Ejercicio28 {
    public static void main(String[] args) {
        int[] numeros = {1, 5, 7, 8, 9, 10, 2};
        int suma = 0;
        for (int numero : numeros) {
            suma+=numero;
        }
        System.out.println("El resultado de la suma de los numeros es: "+suma);
    }
}
