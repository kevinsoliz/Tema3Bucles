import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte suspensos = 0;
        for(int i = 0; i < 5; i++){
            float nota = pedirNota(sc);
            if(nota < 5)
                suspensos++;
        }
        System.out.println(suspensos > 0 ? "Suspensos = " + suspensos : "Todos aprobados!");
    }
    public static float pedirNota(Scanner sc){
        float nota = 0;
        while (true) {
            try {
                System.out.print("Introduce una nota: ");
                nota = sc.nextFloat();
                if (nota >= 0 && nota <= 10)
                    break;
                else
                    System.out.println("Nota Incorrecta!");
            } catch (InputMismatchException e){
                System.out.println("Errorrrr");
                sc.next();
            }
        }
        return nota;
    }
}
