import java.util.Scanner;

public class Ejercicio08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número n: ");
        byte n = sc.nextByte();
        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }
    }
}
