import java.util.Scanner;

public class Ejercicio07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        byte numero = sc.nextByte();
        for (int i = 0;  i < numero; i++) {
            System.out.println("Eco...");
        }
    }
}
