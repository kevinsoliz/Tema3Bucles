import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        short sumaAleatoria;
        short respuesta;
        byte numOperaciones = 0;

        do {
            byte numAle1 = generarNumAleatorio();
            byte numAle2 = generarNumAleatorio();
            sumaAleatoria = (short) (numAle1 + numAle2);
            System.out.print(numAle1 + " + " + numAle2 + " = ");
            respuesta = pedirRespuesta(sc);
            if (verificarRespuesta(respuesta, sumaAleatoria)){
                System.out.println("Correcto!");
                numOperaciones++;
            }
            else
                System.out.println("Incorrecto!");
        } while (verificarRespuesta(respuesta, sumaAleatoria));
        System.out.println("Operaciones acertadas: " + numOperaciones);

    }

    public static short pedirRespuesta(Scanner sc){
        short respuesta;
        while (true){
            try {
                respuesta = sc.nextShort();
                break;
            } catch (InputMismatchException e){
                System.out.println("Número no válido.");
                sc.next();
            }
        }
        return respuesta;
    }

    public static byte generarNumAleatorio(){
        return (byte)((Math.random()*100) + 1);
    }

    public static boolean verificarRespuesta(short respuesta, short sumaAleatoria){
        return (respuesta == sumaAleatoria);
    }
}
