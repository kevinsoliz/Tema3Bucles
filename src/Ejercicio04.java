import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte numAdivinando = pedirNumero(sc);
        byte numAleatorio = numeroAleatorio();
        String mensaje = verificar(numAleatorio, numAdivinando);
        System.out.println(mensaje);

        while (!(mensaje.equals("Has acertado!")) && numAdivinando != -1){ //Había puesto OR al principio, mientras que una sea verdadera el bucle va a seguir.
            numAdivinando = pedirNumero(sc);
            mensaje = verificar(numAleatorio, numAdivinando);
            System.out.println(mensaje);
        }

    }
    public static byte pedirNumero(Scanner sc){
        byte numero = 0;
        boolean valid = false;
        while(!valid){
            try {
                System.out.println("Adivina el número: ");
                numero = sc.nextByte();
                valid = true;
            } catch (InputMismatchException e){
                System.out.println("Número inválido");
                sc.next();
            }
        }
        return numero;
    }
    public static byte numeroAleatorio(){
        return (byte)((Math.random() * 100) + 1);
    }
    public static String verificar(byte numAleatorio, byte numAdivinando){
        String mensaje = "";
        if (numAdivinando == -1)
            mensaje = "Hasta luego!";
        else if(numAleatorio == numAdivinando)
            mensaje = "Has acertado!";
        else if(numAleatorio > numAdivinando)
            mensaje = "Es mayor que " + numAdivinando;
        else
            mensaje = "Es menor que " + numAdivinando;
        return mensaje;
    }
}
