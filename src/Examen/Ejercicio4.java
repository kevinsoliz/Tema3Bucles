package Examen;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte numero = pedirNumero(sc);

        for (int i = 1; i <= numero; i++) {
            if (i % 2 == 0)
                System.out.print(i + " ");
        }
    }
    public static byte pedirNumero(Scanner sc){
        byte numero = 0;
        while (true) {
            try {
                System.out.println("Introduce un entero: ");
                numero = sc.nextByte();
                if (numero > 0)
                    break;
                else
                    System.out.println("Debe ser positivo.");
            } catch (InputMismatchException e){
                sc.next();
                System.out.println("Inválido.");
            }
        }
        return numero;
    }
}
