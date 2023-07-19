import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio4 {
    public static void main (String[] args){
        Scanner frase = new Scanner(System.in);
        String sentencia;
        System.out.print("Ingrese una frase: ");
        sentencia = frase.nextLine();
        String [] palabras = sentencia.split("\\W");
        List <String> palabrasEnMayuscula = new ArrayList<>();
        for (String palabra: palabras) {
            if (Character.isUpperCase(palabra.charAt(0))){
                palabrasEnMayuscula.add(palabra);
            }
        }
        System.out.println(palabrasEnMayuscula);
    }
}
