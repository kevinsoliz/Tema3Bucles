import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte num = 0;
        for (int i = 0; i < 10; i++){
            System.out.print("Introduce un número: ");
            num += sc.nextByte();
        }
        System.out.println("Media = " + num/10);
    }
}
