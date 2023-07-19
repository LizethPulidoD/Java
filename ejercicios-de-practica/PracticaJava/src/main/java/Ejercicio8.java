import java.util.Scanner;

public class Ejercicio8 {
    public static void main (String[] args){
        Scanner dato = new Scanner(System.in);
        System.out.print("Digite un numero: ");
        int numero1 = dato.nextInt();
        System.out.print("Digite un numero: ");
        int numero2 = dato.nextInt();
        if (numero1%2==0 && numero2%2==0){
            System.out.println("Ambos numeros son pares");
        } else if (numero1%2 !=0 && numero2%2 !=0) {
            System.out.println("Ambos numeros son impares");
        }
        else {
            System.out.println("Un numero es par y el otro impar");
        }

    }
}
