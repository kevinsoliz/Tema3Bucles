package Practica;

import java.util.Scanner;

public class Ejer3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el valor del numero: ");
        byte numFilasYColumnas = sc.nextByte();

        for (int i = 0; i < numFilasYColumnas; i++) {
            for (int j = 0; j <= i; j++) {
                for(int k = i; k < numFilasYColumnas; k++) {
                    System.out.print("^ ");
                }
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
