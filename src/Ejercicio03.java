import java.text.NumberFormat;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Ejercicio03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte edad = pedirEdad(sc);

        short totalEdades = 0;
        byte numAlumnos = 0;
        byte mayores = 0;

        while (edad > 0) {
            numAlumnos++;
            totalEdades  += edad;
            if (edad >= 18)
                mayores++;
            edad = pedirEdad(sc);
        }
        float mediaEdades = numAlumnos > 0 ? totalEdades / numAlumnos : 0;
        System.out.println("Total edades: " + totalEdades);
        System.out.println("Total alumnos: " + numAlumnos);
        System.out.println("Media de edades: " + NumberFormat.getNumberInstance(Locale.US).format(mediaEdades));
        System.out.println("Mayores de edad: " + mayores);
    }
    public static byte pedirEdad(Scanner sc){
        byte edad = 0;
        boolean valid = false;
        while(!valid){
            try {
                System.out.println("Introduce edad: ");
                edad = sc.nextByte();
                valid = true;
            } catch (InputMismatchException e){
                System.out.println("Error, número inválido");
                sc.next();
            }
        }
        return edad;
    }
}
