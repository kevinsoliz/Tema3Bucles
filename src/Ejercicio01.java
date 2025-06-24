import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        byte edad = pedirEdad(sc);

        byte edadMax = edad;
        byte edadMin = edad;

        while(edad != -1){
            if(edad > edadMax)
                edadMax = edad;
            if(edad < edadMin)
                edadMin = edad;
            edad = pedirEdad(sc);
        }
        System.out.println("Edad Max: " + edadMax);
        System.out.println("Edad Min: " + edadMin);
    }
    public static byte pedirEdad(Scanner sc){
        byte edad = 0;
        boolean valid = false;
        while(!valid){
            try {
                System.out.println("Introduce edad: ");
                edad = sc.nextByte();
                valid = true;
            } catch (InputMismatchException e) {
                System.out.println("Número inválido");
                sc.next();
            }
        }
        return edad;
    }
    
}
