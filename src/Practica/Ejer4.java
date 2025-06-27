package Practica;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejer4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte numeroPersonas = pedirValor("Introduce el número de personas:  ", sc);

        byte menores = 0;
        byte adultosJovenes = 0;
        byte mayores35 = 0;

        for (int i = 1; i <= numeroPersonas; i++) {
            byte edad = pedirValor("Introduce edad:  ", sc);
            if (edad >= 18 && edad <= 35)
                adultosJovenes++;
            else if (edad > 35)
                mayores35++;
            else
                menores++;
        }
        System.out.println("Menores: " + menores);
        System.out.println("Adultos: " + adultosJovenes);
        System.out.println("Mayores de 35: " + mayores35);
    }

    public static byte pedirValor(String prompt, Scanner sc) {
        byte valor = 0;
        while (true) {
            try {
                System.out.println(prompt);
                valor = sc.nextByte();
                if (valor > 0)
                    break;
                else
                    System.out.println("Valor invalido");
            } catch (InputMismatchException e) {
                sc.next();
                System.out.println("Valor erróneo.");
            }
        }
        return valor;
    }
}
