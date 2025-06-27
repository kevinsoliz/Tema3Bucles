package Practica;

import java.util.Scanner;

public class Ejer3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el valor del numero: ");
        byte numFilasYColumnas = sc.nextByte();

        for (int i = 0; i < numFilasYColumnas; i++){

            for (int j = i; j < numFilasYColumnas; j++){
                System.out.print("  ");
            }
            for (int k = 0; k <= i; k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
