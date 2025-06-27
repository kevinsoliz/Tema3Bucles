package Practica;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejer2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        short a = pedirNumero(sc);
        short b = pedirNumero(sc);
        short mcm = 0;

        for (int i = Math.min(a, b); i > 0; i--){
            if ((a % i == 0) && (b % i == 0)){
                mcm = (short)i;
                i = 0;
            }
        }
        System.out.println("Máximo común divisor de " + a + " y " + b + " = " + mcm);

    }

    public static short pedirNumero(Scanner sc) {
        short numero = 0;
        while (true) {
            try {
                System.out.println("Ingrese el numero: ");
                numero = sc.nextShort();
                break;
            } catch (InputMismatchException e){
                sc.next();
                System.out.println("Número inválido.");
            }
        }
        return numero;
    }
}
