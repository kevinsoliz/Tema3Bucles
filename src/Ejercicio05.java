import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float altura = 0;
        float alturaMax = 0;
        byte etiqueta = 0;
        byte etiquetaDelMasAlto = 0;

        do {
            altura = pedirAltura(sc);
            etiqueta++;
            if (altura > alturaMax) {
                alturaMax = altura;
                etiquetaDelMasAlto = etiqueta;
            }
        } while (altura != -1);

        System.out.println("La etiqueta del más alto es: " + etiquetaDelMasAlto);


    }
    public static float pedirAltura(Scanner sc) {
        float altura = 0;
        while (true){
            try{
                System.out.println("Introduce la altura: ");
                altura = sc.nextFloat();
                break;
            } catch (InputMismatchException e){
                System.out.println("Altura incorrecta.");
                sc.next();
            }
        }
        return altura;
    }
}
