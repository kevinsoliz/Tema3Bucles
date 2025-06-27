package Examen;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double cantidadDeAgua = pedirValor("Cantidad de agua: ", sc);
        byte numAnimales = (byte)(pedirValor("Número de animales: ", sc));
        float litrosPorAnimal = (float)(pedirValor("Litros por animal: ", sc));

        if (cantidadDeAgua / numAnimales < litrosPorAnimal){
            double cantidadQueFalta = numAnimales * litrosPorAnimal - cantidadDeAgua;
            System.out.println("Faltan " + cantidadQueFalta + " litros.");
        }
        else
            System.out.println("Hay suficiente agua.");


    }
    public static double pedirValor(String prompt, Scanner sc) {
        double valor = 0;
        while (true) {
            try {
                System.out.print(prompt);
                valor = sc.nextDouble();
                if (valor > 0)
                    break;
                else
                    System.out.println("Valor negativo.");
            } catch (InputMismatchException e) {
                sc.next();
                System.out.println("Valor invalido.");
            }
        }
        return valor;
    }
}
