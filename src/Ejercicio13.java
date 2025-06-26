import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero: ");

        short numero = sc.nextShort();

        while (numero > 0){
            byte guarismo = (byte) (numero % 10);
            System.out.println(guarismo);
            numero /= 10;
        }
        /*
        do{
            guarismo = (byte)(numero % 10);
            System.out.println("El guarismo es: " + guarismo);
            numero /= 10;
        }while (numero > 0);
         */
    }
}
