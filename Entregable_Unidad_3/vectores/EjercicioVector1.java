import java.util.Scanner;

public class EjercicioVector1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];
        int suma = 0;

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Ingrese el elemento " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
            suma += numeros[i];
        }

        double promedio = (double) suma / numeros.length;

        System.out.println("Suma total: " + suma);
        System.out.println("Promedio: " + promedio);
        scanner.close();
    }
}
