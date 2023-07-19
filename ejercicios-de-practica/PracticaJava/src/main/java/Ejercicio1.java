import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);
        float salario = 1000;
        float comision = 150;
        int numeroDeCarrosVendidos;
        float precioCarro;
        System.out.println("¿Cuantos carros vendio el empleado durante el mes?");
        numeroDeCarrosVendidos = datos.nextInt();
        comision *= numeroDeCarrosVendidos;
        salario +=comision;
        for (int i = 0; i < numeroDeCarrosVendidos; i++) {
            System.out.println("Digite el valor del carro vendido por el empleado: ");
            precioCarro = datos.nextFloat();
            salario += precioCarro*0.05f;
        }
        System.out.println("El salario mensual del empleado es: "+salario);
    }
}
