package Practica;

import java.text.NumberFormat;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Ejer1 {


    private static int indice = 0; //porque si lo incluimos en el método, al llamarlo otra vez se reiniciaría a cero

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double cuantia = 0;
        double total = 0;

        do {
            cuantia = pedirCuantia(generarMensaje(), sc);
            total += cuantia;
        } while (cuantia != 0);

        System.out.println("Cuantia total: " + NumberFormat.getCurrencyInstance(Locale.FRANCE).format(total));
        System.out.println("Indice: " + indice);
    }

    public static float pedirCuantia(String prompt, Scanner sc){
        float cuantia = 0;
        while(true){
            try {
                System.out.print(prompt + ": ");
                cuantia = sc.nextFloat();
                if(cuantia >= 0)
                    break;
                else
                    System.out.println("La cuantía no puede ser negativa!");
            } catch (InputMismatchException e){
                sc.next();
                System.out.println("Cuantía no válida!");
            }
        }
        return cuantia;
    }

    public static String generarMensaje(){
        String[] prompts = {
                "Cantidad de dinero en el banco",
                "Cantidad de dinero en la ucha",
                "Cuánto tienes en los cajones",
                "Cuánto encuentras en los bolsillos"
        };
        String mensaje = prompts[indice]; //De esta manera empieza en 0
        indice = (indice + 1) % prompts.length; // el modulo se queda con la parte entera y devuelve el resto.
                                                // Ha sumado 1, está listo para la siguiente llamada.
        return mensaje;
    }
}
