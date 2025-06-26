import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte aprobados = 0;
        byte suspensos = 0;

        for (int i = 0; i < 6; i++){
            float nota = pedirNota(sc);
            if (nota > 4f) // Curioso, si no le pongo el .0 no funciona, aprueba todos los números con decimales.
                aprobados++;
            else
                suspensos++;
        }

        System.out.println("Aprobados: " + aprobados
                + "\nSuspensos: " + suspensos);

    }
    public static float pedirNota(Scanner sc){
        float nota = 0;
        while (true){
            try {
                System.out.print("Introduce una nota: ");
                nota = sc.nextFloat();
                if (nota >= 0 && nota <= 10)
                    break;
                else
                    System.out.println("Nota incorrecta!");
            } catch (InputMismatchException e){
                sc.next();
                System.out.println("Nota no válida!");
            }
        }
        return nota;
    }
}
