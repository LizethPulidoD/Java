import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        System.out.println("hola mundo");
        byte entero =12;
        short entero2= 32700;
        int entero3 =215000;
        long entero4 = 2147483647;
        System.out.println("Variables primitivas");
        System.out.println("byte: "+entero+" son numeros desde el -128 a 127");
        System.out.println("short: "+entero2+" son numeros desde -32768 a 32767");
        System.out.println("int: "+entero3+" son numeros desde -2147483648 a 2147483647");
        System.out.println("long: "+entero4+" son numeros gigantes");
        double decimal = 12.5;
        float decimal2 = 10.0004f;
        System.out.println("float: "+decimal2+" son numeros decimales");
        System.out.println("double: "+decimal+" son numeros decimales");
        char caracter= 'a';
        System.out.println("Caracter: "+caracter);
        boolean decision = true;
        System.out.println("boolean: usadas para los condiconales "+decision);
        System.out.println("Variables no primitivas");
        Integer numero = null;
        String palabra = "Estrella gorda";
        System.out.println("Integer: "+numero);
        System.out.println("String: "+palabra);
        final Integer constante=10000;
        System.out.println("Constante: "+constante);
        Scanner entrada = new Scanner(System.in);
    }
}
