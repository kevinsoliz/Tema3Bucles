import java.util.Scanner;

public class Ejercicio18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        byte numElementos = sc.nextByte();

        for (int i = 0; i < numElementos; i++) {
            for (int j = i; j < numElementos; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
