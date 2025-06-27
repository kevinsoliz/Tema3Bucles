package Examen;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte hormigas = insectosCapturados("Introduce las hormigas capturadas: ", sc);
        byte aranias = insectosCapturados("Introduce las arañas capturadas: ", sc);
        byte cochinillas = insectosCapturados("Introduce las cochinillas: ", sc);

        System.out.println("Total de hormigas: " + hormigas);
        System.out.println("Total de aranias: " + aranias);
        System.out.println("Total de cochinillas: " + cochinillas);
        System.out.println("Total de patas: " + (6 * hormigas + 8 * aranias + 14 * cochinillas));
    }

    public static byte insectosCapturados(String prompt, Scanner sc){
        byte insectosCapturados = 0;
        while(true){
            try {
                System.out.println(prompt);
                insectosCapturados = sc.nextByte();
                if(insectosCapturados >= 0)
                    break;
                else
                    System.out.println("Los insectos capturados no pueden ser negativos.");
            } catch (InputMismatchException e){
                sc.next();
                System.out.println("Valor incorrecto.");
            }
        }
        return insectosCapturados;
    }
}
