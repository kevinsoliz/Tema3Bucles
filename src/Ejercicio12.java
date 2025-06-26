public class Ejercicio12 {
    public static void main(String[] args) {
        short suma = 0;

        for (int i = 1; i <= 10; i++){
             suma += (short)(i * 2 - 1);
        }
        System.out.println("Suma: " + suma);
    }
}
