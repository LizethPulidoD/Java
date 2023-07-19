import java.util.Scanner;

public class Ejercicio7 {
    public static void main (String[] args){
        Scanner dato = new Scanner(System.in);
        System.out.print("Ingrese el valor de la compra: ");
        float valorCompra = dato.nextFloat();
        if (valorCompra>300){
            float descuento = valorCompra*0.2f;
            valorCompra -= descuento;
        }
        System.out.println(valorCompra);
    }
}
