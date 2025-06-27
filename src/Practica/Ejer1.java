package Practica;

import java.text.NumberFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejer1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double cuantia = 0;
        double total = 0;

        do {
            cuantia = pedirCuantia(generarMensaje(), sc);
            total += cuantia;
        } while (cuantia != 0);

        System.out.println("Cuantia total: " + NumberFormat.getCurrencyInstance().format(total));
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
        String [] prompts = { "Cantidad de dinero en el banco", "Cantidad de dinero en la ucha", "Cuánto tienes en los cajones", "Cuánto encuentras en los bolsillos"};
        byte numAleatorio = (byte)(Math.random()*4);
        return prompts[numAleatorio];
    }
}
