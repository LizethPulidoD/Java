import java.util.HashMap;
import java.util.Scanner;

public class Ejercicio6 {
    public static void main (String [] args){
        Scanner frase = new Scanner(System.in);
        System.out.print("Ingrese una frase: ");
        String sentencia = frase.nextLine();
        String [] palabras = sentencia.split("\\W");
        HashMap <String, Integer> palabrasEnMayuscula = new HashMap<>();
        for (String palabra: palabras) {
            if (Character.isUpperCase(palabra.charAt(0))){
                palabrasEnMayuscula.put(palabra,palabra.length());
            }
        }
        palabrasEnMayuscula.forEach( (palabra,largo)-> System.out.println(palabra+" "+largo));
    }
}
