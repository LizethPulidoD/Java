package co.ejercicioslizethpulido.ejercicio10;

public class Ejercicio10 {
    public static void main(String[] args) {
        System.out.println("SERIE FIBONACCI");
        int numeroAnterior = 0;
        int numeroActual = 1;
        int resultado = numeroAnterior + numeroActual;
        System.out.println(numeroAnterior);
        for (int i = 1; i < 20; i++) {
            System.out.println(resultado);
            numeroAnterior = numeroActual;
            numeroActual = resultado;
            resultado = numeroAnterior + numeroActual;
        }
    }
}
