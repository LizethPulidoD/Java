import java.util.Scanner;

public class Ejercicio9 {
    public static void main (String [] args){
        Scanner dato = new Scanner(System.in);
        System.out.print("Ingrese un numero: ");
        Integer numero = dato.nextInt();
        String number = numero.toString();
        System.out.println("El numero tiene "+number.length()+" cifras");
    }
}
