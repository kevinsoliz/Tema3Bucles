import java.util.Scanner;

public class Ejercicio14 {
    public static int factorial(int numero){
        int resultado = 0;
        if (numero == 0)
            resultado = 1;
        else
            resultado = numero * factorial(numero - 1);
        return resultado;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el numero: ");
        int numero = factorial(sc.nextInt());
        System.out.println(numero);
    }
}
