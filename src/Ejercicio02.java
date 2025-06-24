import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte num = pedirNumero(sc);

        String esPar = num % 2 == 0 ? "Par" : "Impar";
        String esPositivo = num > 0 ? "Positivo" : "Negativo";
        num = (byte) (Math.pow(num, 2));

        System.out.println(esPar);
        System.out.println(esPositivo);
        System.out.println("Cuadrado: " + num);
        sc.close();
    }
    public static byte pedirNumero(Scanner sc){
        byte numero = 0;
        boolean valid = false;
        while(!valid){
            try{
                System.out.println("Ingrese un numero: ");
                numero = sc.nextByte();
                valid = true;
            } catch (InputMismatchException e){
                System.out.println("Error.");
                sc.next();
            }
        }
        return numero;
    }
}
