import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio5 {
    public static void main (String [] args){
        String frase;
        Scanner dato = new Scanner(System.in);
        System.out.print("Ingrese una frase: ");
        frase = dato.nextLine();
        frase = frase.toLowerCase();
        String [] palabras = frase.split("\\W");
        List<String> palabrasPalindromas = new ArrayList<>();
        for (String palabra:palabras) {
            if (palabra.length()>1) {
                StringBuilder palabraAlReves = new StringBuilder();
                for (int i = palabra.length() - 1; i >= 0; i--) {
                    palabraAlReves.append(palabra.charAt(i));
                }
                if (palabraAlReves.toString().equals(palabra)) {
                    palabrasPalindromas.add(palabra);
                }
            }
        }
        System.out.println(palabrasPalindromas);
    }
}
