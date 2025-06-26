public class Ejercicio12 {
    public static void main(String[] args) {
        short suma = 0;

        for (int i = 1; i <= 20; i++){
             if (!(i % 2 == 0))
                suma += i;
        }
        System.out.println("Suma: " + suma);
    }
}
