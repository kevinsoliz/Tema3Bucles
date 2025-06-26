public class Ejercicio13 {
    public static void main(String[] args) {
        short numero = 123;
        byte guarismo = (byte)(numero % 10);
        numero = (short)(numero / 10);

        do{
            System.out.println("El guarismo es: " + guarismo);
            guarismo = (byte)(numero % 10);

            numero /= 10;
        }while (guarismo != 0);
    }
}
