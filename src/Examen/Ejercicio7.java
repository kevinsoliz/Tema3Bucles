package Examen;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte numAle1 = generarAleatorio();
        byte numAle2 = generarAleatorio();
        byte sumaAle = (byte) (numAle1 + numAle2);
        byte respuesta = 0;
        String mensaje = "";
        byte contador = 0;

        while (!(sumaAle == respuesta) || respuesta == -1){
            System.out.println("Adivina el numero aleaotorio: ");
            respuesta = sc.nextByte();
            mensaje = verificar(respuesta, sumaAle);
            System.out.println(mensaje);
            contador++;
        }
        System.out.print(" Te ha tomado " + contador + " intentos.");
    }
    public static byte pedirRespuesta(Scanner sc){
        byte respuesta = 0;
        while (true) {
            try {
                respuesta = sc.nextByte();
                break;
            } catch (InputMismatchException e){
                sc.nextLine();
                System.out.println("Valor inválido.");
            }
        }
        return respuesta;
    }
    public static byte generarAleatorio(){
        return (byte)(Math.random()* 50 + 1);
    }

    public static String verificar(byte respuesta, byte sumaAleatoria){
        String mensaje = "";

        if (respuesta > sumaAleatoria)
            mensaje = "Es menor que " + respuesta;
        else if (sumaAleatoria > respuesta)
            mensaje = "Es mayor que " + respuesta;
        else
            mensaje = "Has acertado!";

        return mensaje;
    }
}
