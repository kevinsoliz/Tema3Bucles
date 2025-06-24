import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte numAdivinando = 0;
        byte numAleatorio = numeroAleatorio();
        String mensaje = "";

        byte numberFallos = 0;

        do {
            numAdivinando = pedirNumero(sc);
            mensaje = verificar(numAleatorio, numAdivinando);
            if(!(mensaje.equals("Has acertado!")))
                numberFallos++;
            System.out.println(mensaje);
        } while (!(mensaje.equals("Has acertado!")) && numAdivinando != -1 && numberFallos != 3);

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
