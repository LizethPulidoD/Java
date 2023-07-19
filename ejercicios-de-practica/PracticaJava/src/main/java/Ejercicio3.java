import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio3 {
    public static void main (String[] args){
        double a, b, c;
        Scanner dato = new Scanner(System.in);
        System.out.print("Ingrese un numero: ");
        a = dato.nextDouble();
        System.out.print("Ingrese un numero: ");
        b = dato.nextDouble();
        System.out.print("Ingrese un numero: ");
        c = dato.nextDouble();
        double discriminante = (Math.pow(b, 2) - (4 * a * c));
        if (discriminante >= 0) {

            double soluciones[];

            // Una solucion
            if(discriminante == 0){

                soluciones = new double[1];

                soluciones[0] = ((-b) - (4 * a * c)) / (2 * a);

                // Dos soluciones
            }else{

                soluciones = new double[2];

                soluciones[0] = ((-b) + discriminante) / (2 * a);

                soluciones[1] = ((-b) - discriminante) / (2 * a);

            }

            System.out.println(Arrays.toString(soluciones));
        } else {
            // Sin solucion
            System.out.println("Sin solucion");
        }
    }
}
