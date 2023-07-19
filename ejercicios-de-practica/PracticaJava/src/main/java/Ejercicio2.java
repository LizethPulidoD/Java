import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        float a;
        float b;
        Scanner dato = new Scanner(System.in);
        System.out.println("Digite un numero: ");
        a =dato.nextFloat();
        System.out.println("Digite un numero: ");
        b= dato.nextFloat();
        double resultado = (Math.pow(a,2))+(Math.pow(b,2))+ (2*a*b);
        System.out.println("El resultado es: "+resultado);
    }
}
