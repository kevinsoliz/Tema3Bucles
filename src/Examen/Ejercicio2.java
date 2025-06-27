package Examen;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte entradasInfantil = pedirValor("Entradas infantiles: ", sc);
        byte entradasAdultos = pedirValor("Entradas adultos: ", sc);
        float precioInfantil = 15.50f;
        float precioAdultos = 20f;

        double importeTotal = entradasInfantil * precioInfantil + entradasAdultos * precioAdultos;
        System.out.println("Importe total sin descuento: " + importeTotal);
        if (importeTotal >= 100){
            importeTotal -= 0.05 * importeTotal;
            System.out.println("Importe total con descuento: " + importeTotal);
        }
        else
            System.out.println("No aplica descuento.");


    }
    public static byte pedirValor(String prompt, Scanner sc) {
        byte valor = 0;
        while (true) {
            try {
                System.out.println(prompt);
                valor = sc.nextByte();
                if (valor >= 0)
                    break;
                else
                    System.out.println("El valor introducido es negativo.");
            } catch (IndexOutOfBoundsException e) {
                sc.nextLine();
                System.out.println("Error!");
            }
        }
        return valor;
    }
}
